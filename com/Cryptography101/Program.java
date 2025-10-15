package com.Cryptography101;

import com.Cryptography101.LanguageDetection.LanguageDetector;
import com.Cryptography101.Utilities.Console;

public class Program {
    public static void main(String[] var0) {
        String whyNationFail = "Life south of the fence, just a few feet away, is rather different." + //
                " While the residents of Nogales, Sonora, live in a relatively prosperous" + //
                " part of Mexico, the income of the average household there is about" + //
                " one-third that in Nogales, Arizona.";

        var detector = new LanguageDetector();
        Console.writeLine(detector.countEnglishWordInText(whyNationFail));
    }
}
