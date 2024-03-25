package TP1.LineCoverageTest;


import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo6;
import org.junit.jupiter.api.Test;

public class Exo6Test {

    @Test
    public void testFizzBuzz() {
        // Test cas standard
        assertEquals("1", Exo6.fizzBuzz(1));
        assertEquals("2", Exo6.fizzBuzz(2));
        assertEquals("Fizz", Exo6.fizzBuzz(3));
        assertEquals("4", Exo6.fizzBuzz(4));
        assertEquals("Buzz", Exo6.fizzBuzz(5));
        assertEquals("FizzBuzz", Exo6.fizzBuzz(15));

        // Test cas limite inférieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo6.fizzBuzz(0);
        });

        // Test cas où n est égal à 1
        assertEquals("1", Exo6.fizzBuzz(1));

        // Test cas où n est égal à 15
        assertEquals("FizzBuzz", Exo6.fizzBuzz(15));
    }
}
