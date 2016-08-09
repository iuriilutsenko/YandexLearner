package ru.yandex.yandexlearner.utils;

import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by user on 23.07.16.
 */
public class JsonHelper extends AsyncTask<String, Void, List<String>> {
    public static final String url = "http://cache-default02f.cdn.yandex.net/download.cdn.yandex.net/mobilization-2016/artists.json";
    public static final String TAG = "LookArt";

    /**
     * Конвертирует JSON в JAVA POJO с помощью библиотеки Jackson
     *
     * @return Список pojo объектов json
     * @throws IOException
     */
    public static List<String> jsonToJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(getDataByJavaIo(), new TypeReference<List<String>>() {
        });
    }

    /**
     * По URL получает данные в формате String
     *
     * @return Data from url.
     * @throws IOException
     */
    // Детали реализации пускай внутри остаются :) Это о ByJavaIo.
    public static String getDataByJavaIo() throws IOException {
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = new URL(url).openStream();
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            return readData(reader);
        } catch (IOException e) {
            Log.e(TAG, "Ошибка чтения данных", e);
            return null;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static String readData(Reader reader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int cp;
        while ((cp = reader.read()) != -1) {
            stringBuilder.append((char) cp);
        }
        return stringBuilder.toString();
    }


    @Override
    protected List<String> doInBackground(String... params) {
        try {
            return jsonToJavaObject();
        } catch (IOException e) {
            Log.e(TAG, "Ошибка исполнения Json", e);
        }
        return null;
    }
}