package ru.yandex.yandexlearner.words;

import java.util.ArrayList;

public class WordStorage {



    private ArrayList<String> russianWords;
    private ArrayList<String> englishWords;

    // TODO - отсортировать списки так, чтобы на i-ых позициях
    // стояли слова с одинаковым значением
    public WordStorage() {
        russianWords = WordSource.getRussianWords();
        englishWords = WordSource.getEnglishWords();
    }

    public ArrayList<String> getRussianWords() {
        return russianWords;
    }

    public ArrayList<String> getEnglishWords() {
        return englishWords;
    }

    public String getRandomEnglishWord() {
        // Магическое число 100. Кроме того get может упасть с OutOfBounds.
        // englishWords.size() было бы чиннее
        int index = (int) (Math.random() * 100);

        return englishWords.get(index);
    }
}
