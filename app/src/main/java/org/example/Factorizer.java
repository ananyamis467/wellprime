package org.example;

import java.util.ArrayList;

//code
public class Factorizer {
    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n <= 1) {
            return factors; // empty list
        }

        // Factor out 2s first
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Factor odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If remaining n is prime > 2
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}

