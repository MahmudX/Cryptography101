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
}
