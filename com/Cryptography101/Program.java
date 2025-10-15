package com.Cryptography101;

import java.util.Random;

import com.Cryptography101.CaeserCipherMethod.CaesarCipher;
import com.Cryptography101.CaeserCipherMethod.CaesarCracker;
import com.Cryptography101.Utilities.Alphabets;

public class Program {
    public static void main(String[] var0) {
        String whyNationFail = "Life south of the fence, just a few feet away, is rather different. " + //
                " While the residents of Nogales, Sonora, live in a relatively prosperous " + //
                " part of Mexico, the income of the average household there is about " + //
                " one-third that in Nogales, Arizona.";

        // String whyNationFailInBengali = "বেড়ার দক্ষিণে, মাত্র কয়েক ফুট দূরে,
        // জীবনযাত্রা বেশ আলাদা। " +
        // "সোনোরার নোগালেসের বাসিন্দারা মেক্সিকোর তুলনামূলকভাবে সমৃদ্ধ " + //
        // "অঞ্চলে বাস করলেও, সেখানকার গড় পরিবারের আয় অ্যারিজোনার নোগালেসের তুলনায়
        // প্রায় " + //
        // "এক-তৃতীয়াংশ।";

        // String whyNationFailInSpanish = "La vida al sur de la valla, a solo unos
        // metros de distancia, es bastante diferente. Si bien los residentes de
        // Nogales, Sonora, viven en una zona relativamente próspera de México, el
        // ingreso familiar promedio allí es aproximadamente un tercio del de Nogales,
        // Arizona.";

        // var detector = new LanguageDetector();
        // Console.writeLine("whyNationFail: \t\t%s",
        // detector.isEnglish(whyNationFail));
        // Console.writeLine("whyNationFailInBengali:\t%s",
        // detector.isEnglish(whyNationFailInBengali));
        // Console.writeLine("whyNationFailInSpanish:\t%s",
        // detector.isEnglish(whyNationFailInSpanish));
        Random rand = new Random();

        var caeser = new CaesarCipher();
        var cipherText = caeser.Encrypt(whyNationFail, rand.nextInt(Alphabets.UPPER.length()));

        var cracker = new CaesarCracker();
        cracker.bruteForeceCrack(cipherText);
    }
}
