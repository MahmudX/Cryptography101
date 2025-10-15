package com.Cryptography101.LanguageDetection;

import java.util.List;

public class LanguageDetector {
    private FileProcessor fileProcessor;
    private List<String> englishWords;

    public LanguageDetector() {
        fileProcessor = new FileProcessor();
        englishWords = fileProcessor.getWords();
    }

    public int countEnglishWordInText(String text) {
        text = text.toUpperCase();

        var words = text.split(" ");

        int matches = 0;

        for (var s : words) {
            if (englishWords.contains(s))
                matches++;
        }
        return matches;
    }

    public boolean isEnglish(String text) {
        int matches = countEnglishWordInText(text);

        // If the text contains 60% english word
        // then we can assume that the text is in English
        return (float) matches / text.split(" ").length * 100 >= 60;
    }
}
