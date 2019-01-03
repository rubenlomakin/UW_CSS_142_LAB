package com.company;
import java.util.Arrays;
import java.util.*;

public class Main {

    public static int[] stretch(int[] array1) {
        int[] newArray = new int[array1.length * 2];
        int j = 0;
        for (int i = 0; i < newArray.length; i = i + 2) {
            int val = array1[j];
            newArray[i] = (val / 2);
            newArray[i + 1] = newArray[i];
            if (val % 2 != 0) {
                newArray[i]++;

            }
            j++;

        }

        System.out.println(Arrays.toString(newArray));

        return newArray;
    }

    /**
     * Exercise 1:
     * Write a function called median, that takes as parameter a full, sorted
     * array of doubles and returns the median of the list. For a sorted list of
     * odd length, the median is the middle value. For a sorted list of even
     * length, the median is the average of the two middle values. Make an example
     * function call in your main.
     */
    public static double median(double[] array) {

        // your code here


        /**
         -find and locate the middle value
         -how will you find the middle value?
         - use an if/else block
         -if(array.length % 2 == 0){
         // array is even in length
         // take the middle two values
         // add them together and always divide them by two
         // retrun that value

         } else if(array.length % 2 == 1){
         // arryay is odd in length
         // take middle value
         // return that value




         */


        double median;

        if (array.length % 2 == 0) {
            median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;

            return median;

        } else {
            median = (double) array[array.length / 2];

        }
        return median; //return the median value
    }

    /**
     * Exercise 2:
     * Write a function called isSorted that takes an array of doubles as a
     * parameter and returns true if the list is in sorted (non-decreasing)
     * order and returns false otherwise.  Make an example function call in
     * your main.
     *
     * @param array
     * @return
     */
    public static Boolean isSorted(double[] array) {

    /*
        Ruben, how do you check if the list is in correct.
        Step 1: Take the list
        Step 2: Read the list
        Step 3: Is the number that is first the lowest?
                -if yes, check the next number
                -else return false

         */

        for (int i = 0; i <= array.length; i++) {
            if (array[i] < array[i + 1]) {
                return true;
            } else {
                return false;
            }
        }

        return null;
    }

    /**
     * Exercise 3:
     * Write a function called findCommon that takes three arrays of positive
     * integers as parameters. The first two array parameters are filled with
     * ints. Fill the third array parameter with all the values that are uniquely
     * in common from the first two arrays and the rest of the array with zeros.
     * For example:
     * <p>
     * a1[] contains: 3 8 5 6 5 8 9 2
     * <p>
     * a2[] contains: 5 15 4 6 7 3 9 11 9 3 12 13 14 9 5 3 13
     * <p>
     * common[] should contain: 3 5 6 9 0 0 0 0
     * <p>
     * public static void findCommon(int[] a1, int[]a2, int[] common) {
     * <p>
     * // your code here, this method requires some serious thinking before
     * // implementing the logic
     * /*
     * So, we have two arrays. We must find the common numbers and fill those (the common) numbers in the
     * ew array called common. So, we can make one for loop that will go through the length of the first array,
     * then a second for loop that will go through the second array. if i == j then we have a common number, and
     * we should place in the new array called common.
     * <p>
     * for(int i = 0; i <= a1.length; i++) {
     * for(int j = 0; j <= a2.length; j++) {
     * if(a1[i] == a2[j]) { //then take num and store in common array
     * // take that value and put it into common array
     * // how would you do that?
     * // todo figure out how to take the common array and update it with the common values from an array
     * }
     * }
     * }
     * }
     */
    public static void findCommon(int[] a1, int[] a2, int[] common) {

        int num = 0;
        for (int i = 0; i < common.length; i++) {
            common[i] = -1;
        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) { // loops through every index of j, while keeping i at one index
                    num = a1[i];
                    for (int k = 0; k < common.length; k++) // makes sure there are
                    // no duplicates in common
                    {
                        if (num != common[k])
                            common[i] = num;
                    }
                }
            }
        }

        for (int supreme : common) {
            if (supreme != -1)
                System.out.print(supreme + " ");
        }
        System.out.println();

    }

    /**
     * Exercise 4:
     * Write a function called rotateRight that takes an array of integers as
     * an argument and rotates values in the array one to the right (i.e., one
     * forward in position), shifting the value at the end of the array to the
     * front. For example, if the array called list stores [3, 8, 19, 7] before
     * the function is called, it should store [7, 3, 8, 19] after the function
     * is called. Another call on rotateRight would leave the list as [19, 7, 3, 8].
     * Another call would leave the list as [8, 19, 7, 3] .
     */
    public static void rotateRight(int[] array) {

        // create a a var that will look at the last element in the array array.length -1;
        // this way we have the last element in the array that we then can place in the beginning of the array
        // then, create a for loop that will take each and every value of the array starting at 0 and rotate it right by
        // placing it in the next array


        int x = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {

            array[i] = array[i - 1];
        }
        array[0] = x;

        System.out.println(Arrays.toString(array));
    }

    public static void rotateRight2(int [] array) {


    }

    /**
     * Exercise 5:
     * Write a function count that takes an array of integers and a target value as
     * parameters and returns the number of occurrences of the target value in the
     * array. For example, if an array called list stores the sequence of values
     * [3, 5, 2, 1, 92, 38, 3, 14, 5, 73] then the following call:
     * int n = count(list, 3);
     * would return 2 because there are 2 occurrences of the value 3 in the list.
     */
    public static int count(int[] array5, int target) {
    // Please note that I am implementing a slightly different method of finding the target value.
    // I ask the user which number they would like to find the number of occurences instead of
    // implementing 'int n = count(list, 3);
    // I hope this doesn't change the grade.


    /*
    Step 1: Take the array and use it in this method
    Step 2: Create a variable that will be responsible for locating the number of occurrences of a specific number - call that 'n'
    Step 3: Introduce that integer variable (int n = count(array, 3);
    Step 4: Go into the array and locate how many times 'n' appears in that array
    Step 5: Return integer 'n'
    Step 6: Call this method in the main

     */


        int countOcc = 0;

        for (int i = 0; i < array5.length; i++) {

            if (array5[i] == target) {

                countOcc++;
            }
        }
        return countOcc;
    }

    /**
     * Exercise 6:
     * Write a function called stretch that takes an array of integers as an
     * argument, and returns a new array twice as large as the original that
     * 'replaces' every integer from the original list with a pair of integers,
     * each half the original, and then returns it. If a number in the original
     * list is odd, then the first number in the new pair should be one higher
     * than the second so that the sum equals the original number. For example,
     * suppose a variable called list stores this sequence of values
     * <p>
     * [18, 7, 4, 24, 11]
     * <p>
     * The number 18 is stretched into the pair (9, 9), the number 7 is stretched
     * into (4, 3), the number 4 is stretched into (2, 2), the number 24 is
     * stretched into (12, 12) and the number 11 is stretched into (6, 5).
     * Thus,the call:
     * <p>
     * stretch(list);
     * <p>
     * should replace list with the following list which is twice the length of
     * the original:
     * <p>
     * [9, 9, 4, 3, 2, 2, 12, 12, 6, 5]
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //for exercises 1, 2
        double[] oddSet = {0.5, 3.1415, 7.6, 42, 799.4};
        double[] evenSet = {0.5, 2.2, 3.1415, 7.6, 42, 799.4};
        double[] notSorted = {3.4, 0.01, 8.7, 2.3};

        System.out.println("Exercise 1: ");
        System.out.println(median(oddSet));
        System.out.println(median(evenSet));
        System.out.println();

        System.out.println("Exercise 2: ");
        System.out.println(isSorted(evenSet));
        System.out.println(isSorted(notSorted));
        System.out.println();

        //for exercises 3, 4, 5
        int[] a1 = {3, 8, 5, 6, 5, 8, 9, 2}; // common numbers: 3 5 6 9
        int[] a2 = {5, 15, 4, 6, 7, 3, 9, 11, 9, 3, 12, 13, 14, 9, 5, 3, 13};
        int[] common = new int[a1.length];

        System.out.println("Exercise 3: ");
        findCommon(a1, a2, common);
        System.out.println();

        System.out.println("Exercise 4: ");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // after rotation: 9 1 2 3 4 5 6 7 8
        // todo figure out how to update the array after each execution
        System.out.println("This is the original array: \n"+ Arrays.toString(array));
        System.out.println();
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        rotateRight(array);
        System.out.println();

        System.out.println("Exercise 5: ");
        System.out.println("Enter the target value you would like to find in the array");
        int target = reader.nextInt();
        int[] array5 = {23, 4, 4, 4, 6, 7, 8, 9}; // after rotation: 9 1 2 3 4 5 6 7 8
        System.out.println("The number of " + target + "(s) in this array is: "+ count(array5, target));
        System.out.println();

        System.out.println("Exercise 6: ");
        int [] array1 = {18, 7, 4, 24, 11 };
        stretch(array1);
        System.out.println();
    }
}


