package com.company;

import java.util.Scanner;

/*
 * @author Ruben Lomakin
 *
 * @version 1.2.0
 *
 * @date 10/9/18
 *
 * The main point of this project class
 * is to take input fro the user
 * and perform calculations, including
 * converting the temperature (F) to (K);
 * converting seconds to hours and minuets and vice versa.
 *
 */

public class Lab2a {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the temperature");

        double temp = reader.nextDouble();

        Kelvins(temp);

        tempperaturePrint(temp);

        System.out.println("");

        System.out.println("Please enter number of seconds");

        double seconds = reader.nextDouble();

        SecondsToMin(seconds);

        System.out.println();

        secondTime(seconds);

        System.out.println("");

        System.out.println("");

        System.out.println("Please enter three integers (hours , minuets, seconds)");

        int hour = reader.nextInt();

        int minuets = reader.nextInt();

        int second = reader.nextInt();

        inSeconds(hour,minuets,second);

        reader.close();
    }

    public static double Kelvins(double temp) {

        double fToK = (5.0/9.0) * (temp - 32) + 273.15;

        fToK = Math.round(fToK);

        System.out.println("The temperature in Kelvins is " + fToK +"°K");

        return fToK;

    }

    public  static void tempperaturePrint (double temp) {

        double fToK = Kelvins(temp);

        System.out.printf(temp + "° F corresponds to "  + fToK + "°K");

    }


    public static double SecondsToMin(double seconds){

        System.out.print(seconds + " seconds corresponds to: ");

        double min = Math.round((seconds / 60.0));

        double hour = Math.round((min /  60.0));

        double second = seconds;

        System.out.print(hour + " hour(s,) " + min + " minuet(s), " + second + " second(s)");

        return min;

    }

    public static int inSeconds(int hour, int minuets, int second) {

        int calculateSec = (hour * 3600) + (minuets* 60) + second;

        System.out.println("Hour(s), minuet(s), and second(s) altogether is " + calculateSec + " seconds");

        return calculateSec;

    }

    public static void secondTime(double seconds) {

        System.out.println("The time in seconds is " + seconds);

    }


}



