package com.Cryptography101.LanguageDetection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    private List<String> words;

    public FileProcessor() {
        this.words = new ArrayList<>();
        getData();
    }

    private void getData() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(new File("com/Cryptography101/LanguageDetection/words_alpha.txt"));
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                words.add(line.toUpperCase());
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<String> getWords() {
        return words;
    }
}
