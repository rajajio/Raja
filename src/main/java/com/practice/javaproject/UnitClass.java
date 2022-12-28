package com.practice.javaproject;

import java.util.Scanner;

public class UnitClass {

    private static  double  cup;
    private static  double tbsp;
    private static double tsp;

    public static void setCup(double cup) {
        UnitClass.cup = cup;
    }

    public static void setTbsp(double tbsp) {
        UnitClass.tbsp = tbsp;
    }

    public static void setTsp(double tsp) {
        UnitClass.tsp = tsp;
    }


    public static Scanner scanner = new Scanner(System.in);

    public static double convertorFromPinttoCup(){
        System.out.println("Enter the Value of Pint : ");
        double pint =scanner.nextDouble();
        if (pint>=0) {
            UnitClass.setCup(pint*2);
        }else {
            System.out.println("Enter the Valid tbsp");
        }
        System.out.println("Value of cup :" + cup);
        return cup;

    }

    public static double convertorFromCuptoTbsp(){
        System.out.println("Enter the Value of cup : ");
        cup =scanner.nextDouble();
        if (cup>=0) {
            UnitClass.setTbsp(cup * 16);
        }else {
            System.out.println("Enter the Valid Cup Data");
        }
        System.out.println("Value of tbsp :" + tbsp);
        return tbsp;

    }

    public static double convertorFromTbsptoTsp(){
        System.out.println("Enter the Value of tbsp : ");
        tbsp =scanner.nextDouble();
        if (tbsp>=0) {

           UnitClass.setTsp(tbsp*3);
        }else {
            System.out.println("Enter the Valid tbsp");
        }
        System.out.println("Value of tsp :" + tsp);
        return tsp;

    }
}
