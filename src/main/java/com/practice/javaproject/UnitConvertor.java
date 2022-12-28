package com.practice.javaproject;

import java.util.Scanner;

public class UnitConvertor extends UnitClass{

    private static char choice;

    public static void repeatFunction() {
        System.out.println("Wants to Continue (Y/N): ");
        choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            volumeLab();
        }
        scanner.close();
    }

    public static void volumeLab() {
        System.out.println("Enter the option to Convert");
        System.out.println("1. Convert tbsp to tsp: ");
        System.out.println("2. Convert cup to tbsp: ");
        System.out.println("3. Convert pint to cup: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                convertorFromTbsptoTsp();
                repeatFunction();
                break;
            case 2:
                convertorFromCuptoTbsp();
                repeatFunction();
                break;
            case 3:
                convertorFromPinttoCup();
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
