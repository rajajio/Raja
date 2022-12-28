package com.practice.javaproject;

import java.util.Scanner;

public class DegreeConverrstion extends CelsiusDegree {


    public static void repeatFunction() {
        char choice = 0;
        System.out.println("Wants to Continue (Y/N): ");
        choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            volumeLab();
        }
        scanner.close();
    }

    public static void volumeLab() {
        System.out.println("Enter the option to Convert");
        System.out.println("1. Convert celsisus to fahrenheit: ");
        System.out.println("2. Convert fahrenhiet to celsisus: ");
        System.out.println("3. Convert celsisus to Kelvin: ");
        System.out.println("4. Convert fahrenhiet to Kelvin: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                conversionCelsiusToFahren();
                repeatFunction();
                break;
            case 2:
                conversionoFahrenToCelsius();
                repeatFunction();
                break;
            case 3:
                conversionCelsiusToKelvin();
                repeatFunction();
                break;
            case 4:
                conversionFahrenheitToKelvin();
                repeatFunction();
                break;

            default:
                break;

        }


    }

    public static void main(String[] args) {
        volumeLab();
    }
}
