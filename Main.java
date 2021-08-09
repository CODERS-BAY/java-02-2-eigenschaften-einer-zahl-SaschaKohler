package com.sksoft;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        double magicNumber = 3;

        System.out.print("Please provide an input: ");
        System.out.println();
        String a = input.nextLine();



        double value1 = Double.parseDouble(a);
        if( value1 % 1 == 0) {
            System.out.println("Ihre Eingabe ist ganzzahlig");
            if (value1 % 2 == 0) {
                System.out.println("Die eingegebene Zahl ist gerade");
            }else{
                System.out.println("Die eingegeben Zahl ist ungerade");

            }

        } else {
            System.out.println("Die eingegbene Zahl ist eine Dezimalzahl");
        }

        if (value1>=10 && value1 < 100) {
            System.out.println("Die eingegegbene Zahl ist zweistellig");

        }

        if (value1 == magicNumber) {
            System.out.println("You nailed it!");
        }



    }
}

