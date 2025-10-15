package com.Cryptography101.CaeserCipherMethod;

import com.Cryptography101.Utilities.Alphabets;
import com.Cryptography101.Utilities.Console;
import java.util.HashMap;
import java.util.Map;

public class FrequencyAnalyzer {
    public Map<Character, Integer> run(String text) {
        text = text.toUpperCase();

        Map<Character, Integer> frequencies = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Alphabets.UPPER.indexOf(c) == -1) {
                continue;
            }
            if (frequencies.containsKey(c)) {
                frequencies.put(c, frequencies.get(c) + 1);
            } else {
                frequencies.put(c, 1);
            }
        }

        return frequencies;
    }

    public void showFrequencies(String text) {
        var frequencies = run(text);

        for (var entry : frequencies.entrySet()) {
            Console.writeLine("Character %s has frequency: %s", entry.getKey(), entry.getValue());
        }
    }

}
