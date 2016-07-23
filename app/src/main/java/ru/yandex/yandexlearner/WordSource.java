package ru.yandex.yandexlearner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class WordSource {
    public static String jsonString = "{\n" +
            "  \"en\": [\n" +
            "    \"shock\",\n" +
            "    \"start\",\n" +
            "    \"mind\",\n" +
            "    \"cloth\",\n" +
            "    \"sleep\",\n" +
            "    \"land\",\n" +
            "    \"belief\",\n" +
            "    \"behavior\",\n" +
            "    \"sugar\",\n" +
            "    \"history\",\n" +
            "    \"hate\",\n" +
            "    \"offer\",\n" +
            "    \"pain\",\n" +
            "    \"ice\",\n" +
            "    \"thought\",\n" +
            "    \"secretary\",\n" +
            "    \"swim\",\n" +
            "    \"society\",\n" +
            "    \"soap\",\n" +
            "    \"music\",\n" +
            "    \"month\",\n" +
            "    \"trouble\",\n" +
            "    \"front\",\n" +
            "    \"use\",\n" +
            "    \"liquid\",\n" +
            "    \"wood\",\n" +
            "    \"night\",\n" +
            "    \"brother\",\n" +
            "    \"answer\",\n" +
            "    \"name\",\n" +
            "    \"soup\",\n" +
            "    \"insurance\",\n" +
            "    \"journey\",\n" +
            "    \"attack\",\n" +
            "    \"disease\",\n" +
            "    \"surprise\",\n" +
            "    \"run\",\n" +
            "    \"smile\",\n" +
            "    \"price\",\n" +
            "    \"weather\",\n" +
            "    \"oil\",\n" +
            "    \"stop\",\n" +
            "    \"government\",\n" +
            "    \"art\",\n" +
            "    \"chance\",\n" +
            "    \"jump\",\n" +
            "    \"meal\",\n" +
            "    \"discussion\",\n" +
            "    \"suggestion\",\n" +
            "    \"play\",\n" +
            "    \"building\",\n" +
            "    \"move\",\n" +
            "    \"blood\",\n" +
            "    \"reaction\",\n" +
            "    \"rain\",\n" +
            "    \"payment\",\n" +
            "    \"mist\",\n" +
            "    \"money\",\n" +
            "    \"waste\",\n" +
            "    \"company\",\n" +
            "    \"sand\",\n" +
            "    \"milk\",\n" +
            "    \"machine\",\n" +
            "    \"lead\",\n" +
            "    \"push\",\n" +
            "    \"peace\",\n" +
            "    \"family\",\n" +
            "    \"teaching\",\n" +
            "    \"organization\",\n" +
            "    \"doubt\",\n" +
            "    \"fall\",\n" +
            "    \"glass\",\n" +
            "    \"damage\",\n" +
            "    \"friend\",\n" +
            "    \"news\",\n" +
            "    \"slip\",\n" +
            "    \"wine\",\n" +
            "    \"power\",\n" +
            "    \"flight\",\n" +
            "    \"detail\",\n" +
            "    \"sense\",\n" +
            "    \"feeling\",\n" +
            "    \"memory\",\n" +
            "    \"opinion\",\n" +
            "    \"story\",\n" +
            "    \"change\",\n" +
            "    \"man\",\n" +
            "    \"credit\",\n" +
            "    \"space\",\n" +
            "    \"number\",\n" +
            "    \"song\",\n" +
            "    \"punishment\",\n" +
            "    \"letter\",\n" +
            "    \"connection\",\n" +
            "    \"produce\",\n" +
            "    \"road\",\n" +
            "    \"rest\",\n" +
            "    \"pull\",\n" +
            "    \"shake\",\n" +
            "    \"country\"\n" +
            "  ],\n" +
            "  \"ru\": [\n" +
            "    \"опять\",\n" +
            "    \"ещё\",\n" +
            "    \"он\",\n" +
            "    \"сделать\",\n" +
            "    \"вы\",\n" +
            "    \"белый\",\n" +
            "    \"получить\",\n" +
            "    \"нужный\",\n" +
            "    \"думать\",\n" +
            "    \"очень\",\n" +
            "    \"чёрный\",\n" +
            "    \"знать\",\n" +
            "    \"вдруг\",\n" +
            "    \"иметь\",\n" +
            "    \"совсем\",\n" +
            "    \"разный\",\n" +
            "    \"страна\",\n" +
            "    \"место\",\n" +
            "    \"жизнь\",\n" +
            "    \"понять\",\n" +
            "    \"главный\",\n" +
            "    \"нужно\",\n" +
            "    \"я\",\n" +
            "    \"сидеть\",\n" +
            "    \"делать\",\n" +
            "    \"далёкий\",\n" +
            "    \"дом\",\n" +
            "    \"лицо\",\n" +
            "    \"работа\",\n" +
            "    \"полный\",\n" +
            "    \"можно\",\n" +
            "    \"ребенок\",\n" +
            "    \"хороший\",\n" +
            "    \"тоже\",\n" +
            "    \"вид\",\n" +
            "    \"понимать\",\n" +
            "    \"друг\",\n" +
            "    \"такой\",\n" +
            "    \"мир\",\n" +
            "    \"сила\",\n" +
            "    \"его\",\n" +
            "    \"почти\",\n" +
            "    \"идти\",\n" +
            "    \"советский\",\n" +
            "    \"также\",\n" +
            "    \"сегодня\",\n" +
            "    \"слово\",\n" +
            "    \"лучший\",\n" +
            "    \"стать\",\n" +
            "    \"вопрос\",\n" +
            "    \"молодой\",\n" +
            "    \"сразу\",\n" +
            "    \"пойти\",\n" +
            "    \"этот\",\n" +
            "    \"сам\",\n" +
            "    \"например\",\n" +
            "    \"вообще\",\n" +
            "    \"видеть\",\n" +
            "    \"то\",\n" +
            "    \"оказаться\",\n" +
            "    \"основной\",\n" +
            "    \"они\",\n" +
            "    \"глаз\",\n" +
            "    \"как\",\n" +
            "    \"мы\",\n" +
            "    \"быть\",\n" +
            "    \"спросить\",\n" +
            "    \"настоящий\",\n" +
            "    \"раз\",\n" +
            "    \"рука\",\n" +
            "    \"особенно\",\n" +
            "    \"говорить\",\n" +
            "    \"она\",\n" +
            "    \"уже\",\n" +
            "    \"хотеть\",\n" +
            "    \"один\",\n" +
            "    \"русский\",\n" +
            "    \"сторона\",\n" +
            "    \"себя\",\n" +
            "    \"наш\",\n" +
            "    \"новый\",\n" +
            "    \"нет\",\n" +
            "    \"хорошо\",\n" +
            "    \"голова\",\n" +
            "    \"дела\",\n" +
            "    \"ты\",\n" +
            "    \"работать\",\n" +
            "    \"старый\",\n" +
            "    \"большой\",\n" +
            "    \"дать\",\n" +
            "    \"мочь\",\n" +
            "    \"бить\",\n" +
            "    \"свой\",\n" +
            "    \"последний\",\n" +
            "    \"маленький\",\n" +
            "    \"смотреть\",\n" +
            "    \"вместе\",\n" +
            "    \"день\",\n" +
            "    \"взять\",\n" +
            "    \"надо\"\n" +
            "  ]\n" +
            "}\n";

    public static ArrayList<String> getRussianWords() {
        return getWords("ru");
    }

    public static ArrayList<String> getEnglishWords() {
        return getWords("en");
    }

    private static ArrayList<String> getWords(String locale) {
        try {
            ArrayList<String> words = new ArrayList<>();
            JSONArray jsonWords = new JSONObject(jsonString).getJSONArray(locale);

            for (int i = 0; i < jsonWords.length(); i++) {
                words.add(jsonWords.getString(i));
            }

            return words;
        } catch(JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
