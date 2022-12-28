package com.practice.javaproject;

public class CelsiusDegree extends FahrenheitDegree{

    private static double celsius;

    public static void setCelsius(double celsius) {
        CelsiusDegree.celsius = celsius;
    }

    public static double conversionoFahrenToCelsius() {
        System.out.println("Enter the Fahrenheit Value: ");
        double fahren = scanner.nextDouble();
        CelsiusDegree.setCelsius((fahren - 32) * 5 / 9);
        System.out.println(celsius);
        return celsius;
    }


}
