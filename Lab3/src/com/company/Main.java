package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        // PART 1 ODD EVEN CHECKER

        System.out.println("please enter an integer");

        double userInput = reader.nextInt();

        method2(userInput);

        // PART 1  MULTIPLE CHECKER

        System.out.println("please enter number 1");

        int number3 = reader.nextInt();

        System.out.println("please enter number 2");

        int number4 = reader.nextInt();


        // PART 3 BOOLEAN EXPRESSIONS

        boolean multiple = ismultiple(number3, number4);

        if (multiple == true) {
            System.out.println("both numbers (are multiples of eachother)");
        } else {
            System.out.println("numbers are not multiples of eachother)");
        }


        // PART 2 SQRT

        System.out.println("please entter another number");

        int number5 = reader.nextInt();

        System.out.println("and another number");

        int number6 = reader.nextInt();

        Scanner(number5, number6);

        // PART 4 BELOW


        System.out.println("Please enter two more integers");

        int numebr7 = reader.nextInt();

        int number8 = reader.nextInt();

        CompareTwoNum(number8, numebr7);



        System.out.println("Please enter three more integers");

        int a = reader.nextInt();

        int b = reader.nextInt();

        int c = reader.nextInt();

        CompareThreeNum(a, b, c);



        // PART 5 IN SEPARATE FILE
    }


    // PART 1 METHOD BELOW

    public static double method2(double userInput) {

        // PART 1 METHOD

        double tree = userInput;

        if ((tree % 2) == 0) {

            System.out.println("the number you have entered is even");
            // even
        } else {

            System.out.println("the number you have entered is odd");
            // odd
        }
        return tree;
    }

    public static boolean ismultiple(int number3, int number4) {

        // PART OF PART 1 

        int remainder = number3 % number4;

        boolean multiple;

        if (remainder != 0) {

            multiple = false;

        } else {

            multiple = true;

        }
        return multiple;

    }

    public static double Scanner(int number5, int number6) {

        // PART TWO METHOD

        double sqrt1 = Math.sqrt(number5);

        double sqrt2 = Math.sqrt(number6);

        double sqrt1PlusSqrt2 = sqrt1 + sqrt2;

        if (sqrt1PlusSqrt2 <= 10) {

            System.out.println("Less than or equal to 10");

        } else if (sqrt1PlusSqrt2 > 10 && sqrt1PlusSqrt2 <= 20) {

            System.out.println("Between 10 and 20");

        } else if (sqrt1PlusSqrt2 > 20 && sqrt1PlusSqrt2 <= 30) {

            System.out.println("Between 20 and 30");

        } else if (sqrt1PlusSqrt2 >= 30) {

            System.out.println("Greater than 30");
        }

        return sqrt1PlusSqrt2;
    }

    public static int CompareTwoNum(int number7, int number8) {

        // PART 4 METHOD

        int notSureWhy7 = number7;

        int notSureWhy8 = number8;

        if (number7 == number8) {

            System.out.println("Numbers are equal to each other");

        } else if (number7 > number8) {

            System.out.println(number7 + " is greater than " + number8);

        } else if (number8 > number7) {

            System.out.println(number8 + " is grrater than " + number7);
        }

        return notSureWhy7;
    }

    public static int CompareThreeNum(int a, int b, int c) {

        // PART 4 SECOND PART

        if (a < b) {

            if (a < c) {

                System.out.println(a + " is the smallest number");

                return a;
            }
        } else if (!(a < b)) {

            if(b < c) {

                System.out.println(b + " is the smallest number");

                return b;

            }

            if(!(b < c)) {

                System.out.println(c + " is the smallest number");

                return c;
            }

            return b;

        }

        return a;

    }
}





