package com.practice.javaproject;

import java.util.Scanner;

public class FahrenheitDegree extends KelvinDegree {
    private static double fahrenheit;

    public static void setFahrenheit(double fahrenheit) {
        FahrenheitDegree.fahrenheit = fahrenheit;
    }

    public static double conversionCelsiusToFahren() {
        System.out.println("Enter the Celsius Value: ");
        double cels = scanner.nextDouble();
        FahrenheitDegree.setFahrenheit((cels * 9 / 5) + 32);// = (cels * 9 / 5) + 32;
        System.out.println("Fahrenheit Value: " + fahrenheit);
        return fahrenheit;
    }

}
