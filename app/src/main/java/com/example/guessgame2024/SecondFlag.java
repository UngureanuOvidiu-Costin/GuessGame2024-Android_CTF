package com.example.guessgame2024;

import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class SecondFlag {
    static boolean check = false;
    private static String targetNumber;
    public static int compare(String str1, String str2) {
        // Ambele șiruri au aceeași lungime
        int length = Math.min(str1.length(), str2.length());

        // Suma diferențelor ASCII
        int asciiDifferenceSum = 0;

        // Diferențele ASCII pentru fiecare caracter de pe aceeași poziție
        for (int i = 0; i < length; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // Diferența ASCII și adaugă la suma totală
            asciiDifferenceSum += Math.abs((int) char1 - (int) char2);
        }

        if(asciiDifferenceSum == 0){
            check = true;
        }

        return asciiDifferenceSum;
    }

    public static String giveSecondFlag(){
        if(check == true){
            return (new Object() {int t;public String toString() {byte[] buf = new byte[23];t = 1290269676;buf[0] = (byte) (t >>> 17);t = 1164783740;buf[1] = (byte) (t >>> 13);t = 107779170;buf[2] = (byte) (t >>> 13);t = 187533708;buf[3] = (byte) (t >>> 19);t = -1253692440;buf[4] = (byte) (t >>> 5);t = -2007459633;buf[5] = (byte) (t >>> 6);t = -633649452;buf[6] = (byte) (t >>> 22);t = -2023632241;buf[7] = (byte) (t >>> 16);t = -734532159;buf[8] = (byte) (t >>> 5);t = 1862232768;buf[9] = (byte) (t >>> 24);t = -1843501687;buf[10] = (byte) (t >>> 8);t = 1393462774;buf[11] = (byte) (t >>> 22);t = -1962979654;buf[12] = (byte) (t >>> 19);t = -1036386621;buf[13] = (byte) (t >>> 1);t = -38782461;buf[14] = (byte) (t >>> 7);t = -73113508;buf[15] = (byte) (t >>> 19);t = -868290961;buf[16] = (byte) (t >>> 21);t = -1698658845;buf[17] = (byte) (t >>> 22);t = 1595532308;buf[18] = (byte) (t >>> 24);t = 2016505035;buf[19] = (byte) (t >>> 15);t = -1917573972;buf[20] = (byte) (t >>> 15);t = 1332669328;buf[21] = (byte) (t >>> 9);t = 1504251492;buf[22] = (byte) (t >>> 18);return new String(buf);}}.toString());
        }else{
            return "False";
        }
    }

    public static void generateRandom() {
        int length = 5;
        // Caracterele permise
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Inițializăm un obiect de tip Random
        Random random = new Random();

        StringBuilder randomString = new StringBuilder(length);

        // Caractere aleatorii și add la șirul rezultat
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allowedCharacters.length());
            char randomChar = allowedCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }
        targetNumber = randomString.toString();
        Log.d("CTF", targetNumber);
    }

    static void checkNumber(String userNumberStr) {
        if (userNumberStr.length() == 5) {
            int x = compare(targetNumber, userNumberStr);
            if (x == 0) {
                Log.d("CTF", "Well done! You guessed the password, here is the flag: " + giveSecondFlag());
            } else {
                Log.d("CTF", "Bad password: " + x + " miliseconds");
            }
        } else {
            Log.d("CTF", "Bad length password");
        }
    }
}
