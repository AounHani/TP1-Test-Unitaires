package TP1.LineCoverageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo4;
import org.junit.jupiter.api.Test;

public class Exo4Test {

    @Test
    public void testSolve() {
        // Test cas standard avec deux racines réelles distinctes
        double[] result1 = Exo4.solve(1, -3, 2);
        assertNotNull(result1);
        assertEquals(2, result1.length);
        assertEquals(2.0, result1[0]);
        assertEquals(1.0, result1[1]);

        // Test cas avec une seule racine réelle
        double[] result2 = Exo4.solve(1, -2, 1);
        assertNotNull(result2);
        assertEquals(1, result2.length);
        assertEquals(1.0, result2[0]);

        // Test cas avec pas de racine réelle
        double[] result3 = Exo4.solve(1, 2, 3);
        assertNull(result3);

        // Test cas avec a égal à zéro (doit lancer une exception)
        assertThrows(IllegalArgumentException.class, () -> {
            Exo4.solve(0, 1, 2);
        });
    }
}

