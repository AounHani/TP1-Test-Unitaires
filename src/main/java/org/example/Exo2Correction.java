package org.example;

public class Exo2Correction {

    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new NullPointerException("Strings must not be null");
        }
        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[26]; // Utilisation de 26 pour les lettres de l'alphabet
        for (int i = 0; i < s1.length(); i++) { // Correction de la condition de boucle
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}

