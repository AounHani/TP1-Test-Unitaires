package TP1.ConditionCoverageTest;

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

        // Test cas où n est divisible par 3 mais pas par 5
        assertEquals("Fizz", Exo6.fizzBuzz(9));

        // Test cas où n est divisible par 5 mais pas par 3
        assertEquals("Buzz", Exo6.fizzBuzz(20));

        // Test cas où n n'est ni divisible par 3 ni par 5
        assertEquals("7", Exo6.fizzBuzz(7));

        // Test cas où n est divisible par 3 et par 5
        assertEquals("FizzBuzz", Exo6.fizzBuzz(30));

        // Test cas où n est égal à 2
        assertEquals("2", Exo6.fizzBuzz(2));

        // Test cas où n est divisible par 3 mais pas par 5
        assertEquals("Fizz", Exo6.fizzBuzz(6));

        // Test cas où n est divisible par 5 mais pas par 3
        assertEquals("Buzz", Exo6.fizzBuzz(10));

        // Test cas où n est égal à 7
        assertEquals("7", Exo6.fizzBuzz(7));
    }
}
