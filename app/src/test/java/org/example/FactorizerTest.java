package org.example;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

//tests
class FactorizerTest {

    private Factorizer factorizer;

    /*@BeforeEach
    void setUp() {
        factorizer = new Factorizer();
    }*/

    @Test
    void itReturnsAnEmptyListForZero() {
        Factorizer factorizer = new Factorizer();
        assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
    }

    @Test
    void testPrimeNumber() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(13));
        assertEquals(expected, factorizer.primeFactors(13));
    }


    @Test
    void testCompositeNumber() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 2, 3, 7));
        assertEquals(expected, factorizer.primeFactors(84));
    }
}
