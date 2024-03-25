package TP1.BranchCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo3Correction;
import org.junit.jupiter.api.Test;

public class Exo3Test {

    @Test
    public void testBinarySearch() {
        int[] array = {1, 3, 5, 7, 9, 11, 13};

        // Test cas standard
        assertEquals(0, Exo3Correction.binarySearch(array, 1));
        assertEquals(3, Exo3Correction.binarySearch(array, 7));
        assertEquals(6, Exo3Correction.binarySearch(array, 13));

        // Test cas où l'élément n'est pas présent
        assertEquals(-1, Exo3Correction.binarySearch(array, 2));
        assertEquals(-1, Exo3Correction.binarySearch(array, 10));

        // Test avec tableau vide
        assertEquals(-1, Exo3Correction.binarySearch(new int[0], 5));

        // Test avec tableau null (doit lancer une exception)
        assertThrows(NullPointerException.class, () -> {
            Exo3Correction.binarySearch(null, 5);
        });

        // Test cas où l'élément est dans la dernière moitié du tableau
        int[] array2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        assertEquals(8, Exo3Correction.binarySearch(array2, 17));

        // Test cas où l'élément est dans la première moitié du tableau
        assertEquals(3, Exo3Correction.binarySearch(array2, 7));

        // Test cas où l'élément est au milieu du tableau
        assertEquals(5, Exo3Correction.binarySearch(array2, 11));
    }
}
