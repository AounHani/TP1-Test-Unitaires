package TP1.ConditionCoverageTest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Exo1Correction;

public class Exo1Test {
    @Test
    public void testIsPalindrome() {
        // Test cas standard avec un palindrome
        assertTrue(Exo1Correction.isPalindrome("radar"));
        assertTrue(Exo1Correction.isPalindrome("A man a plan a canal Panama"));

        // Test cas standard avec une chaîne qui n'est pas un palindrome
        assertFalse(Exo1Correction.isPalindrome("hello"));
        assertFalse(Exo1Correction.isPalindrome("not a palindrome"));

        // Test cas limite avec une chaîne vide
        assertTrue(Exo1Correction.isPalindrome(""));

        // Test cas limite avec une chaîne nulle
        assertThrows(NullPointerException.class, () -> {
            Exo1Correction.isPalindrome(null);
        });


        // Test cas où la chaîne contient deux caractères identiques
        assertTrue(Exo1Correction.isPalindrome("aa"));

        // Test cas où la chaîne contient deux caractères différents
        assertFalse(Exo1Correction.isPalindrome("ab"));
    }

    @Test
    public void testIsPalindrome_EvenLength() {
        // Test avec chaîne de longueur paire
        assertTrue(Exo1Correction.isPalindrome("deed")); // Palindrome simple
        assertFalse(Exo1Correction.isPalindrome("abcd")); // Non-palindrome simple
    }

    @Test
    public void testIsPalindrome_OddLength() {
        // Test avec chaîne de longueur impaire
        assertTrue(Exo1Correction.isPalindrome("level")); // Palindrome simple
        assertFalse(Exo1Correction.isPalindrome("world")); // Non-palindrome simple
    }

}

