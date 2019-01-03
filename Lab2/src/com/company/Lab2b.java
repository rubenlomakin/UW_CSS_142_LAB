package com.company;

import java.util.Scanner;


/*

*@author Ruben Lomakin
*
* @version 2.0 - updated
* @date 10/10/18
*
 */

public class Lab2b {

    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter your name followed by three numbers separated by space:" );

        String name = reader.next();

        double number1 = reader.nextDouble();

        double number2 = reader.nextDouble();

        double number3 = reader.nextDouble();

        double min =  Math.min(Math.min(number1, number2),number3);

        System.out.println(name + " " + min);

    }

}
