package TP1.ConditionCoverageTest;

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

        // Test avec des conditions spécifiques
        assertEquals(3, Exo3Correction.binarySearch(array, 7)); // l'élément se trouve au milieu du tableau
        assertEquals(0, Exo3Correction.binarySearch(array, 1)); // l'élément se trouve au début du tableau
        assertEquals(6, Exo3Correction.binarySearch(array, 13)); // l'élément se trouve à la fin du tableau
        assertEquals(-1, Exo3Correction.binarySearch(array, 0)); // l'élément est plus petit que tous les éléments du tableau
        assertEquals(-1, Exo3Correction.binarySearch(array, 14)); // l'élément est plus grand que tous les éléments du tableau
    }
}

