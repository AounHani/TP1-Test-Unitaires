package TP1.ConditionCoverageTest;


import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo5Correction;
import org.junit.jupiter.api.Test;

public class Exo5Test {

    @Test
    public void testToRoman() {
        // Test cas standard
        assertEquals("IV", Exo5Correction.toRoman(4));
        assertEquals("IX", Exo5Correction.toRoman(9));
        assertEquals("XLII", Exo5Correction.toRoman(42));
        assertEquals("XCIX", Exo5Correction.toRoman(99));
        assertEquals("CDXLIV", Exo5Correction.toRoman(444));
        assertEquals("CMXCIX", Exo5Correction.toRoman(999));


        // Test cas limite inférieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo5Correction.toRoman(0);
        });

        // Test cas limite supérieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo5Correction.toRoman(4000);
        });

        // Test cas avec n égal à 1
        assertEquals("I", Exo5Correction.toRoman(1));

        // Test cas avec n égal à 3999
        assertEquals("MMMCMXCIX", Exo5Correction.toRoman(3999));

        // Test cas où n est égal à 5
        assertEquals("V", Exo5Correction.toRoman(5));

        // Test cas où n est égal à 100
        assertEquals("C", Exo5Correction.toRoman(100));

        // Test cas où n est égal à 500
        assertEquals("D", Exo5Correction.toRoman(500));

        // Test cas où n est égal à 1000
        assertEquals("M", Exo5Correction.toRoman(1000));
    }
}
