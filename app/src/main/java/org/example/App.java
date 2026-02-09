package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//driver
public class App {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Factorizer factorizer = new Factorizer();

    System.out.print("Enter an integer: ");
    int number = s.nextInt();

    ArrayList<Integer> factors = factorizer.primeFactors(number);

    if (factors.isEmpty()) {
        System.out.println("No prime factors.");
    } else {
        System.out.println("Prime factors of " + number + ": " + factors);
    }

    s.close();
  }
}
