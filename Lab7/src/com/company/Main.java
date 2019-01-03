package com.company;

import java.util.*;
import java.awt.List;
import java.util.Scanner;

/** Lab 7
 * @author Ruben Lomakin
 * @version 11/13/18
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Scanner read = new Scanner(System.in);

        capitalizeFirstLetters(reader);

        nameInitials(reader);

        letterCount(reader);

        System.out.println("Please enter a string" );

        largestBy(read);

        lexLargest(read);


        // end main method

    }
    // take user input as a String and then
    // capitalize the first letter of every
    // word.
    public static void capitalizeFirstLetters(Scanner reader) {

        System.out.println("Enter a string.");

        String str = reader.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }

        String newString = String.join(" ", arr);

        System.out.println(newString);

        System.out.println();
    }
    // Ask for user initials and then return
    // the capitalized version of it back
    public static void nameInitials(Scanner reader) {

        System.out.println("Enter your full name.");

        String name = reader.nextLine();

        String[] arrName = name.split(" ");

        for (int i = 0; i < arrName.length; i++) {
            arrName[i] = arrName[i].substring(0,1).toUpperCase();
        }

        String newNameString = String.join(".", arrName);

        System.out.println(newNameString);

        System.out.println();
    }
    public static void letterCount(Scanner reader) {

        System.out.println("Enter string 1");

        String strOne = reader.nextLine();

        System.out.println("Enter string 2");

        String strTwo = reader.nextLine();

        System.out.println("What is the letter you would like to the number of occurrences of");

        String strLetterSearch = reader.next();

        int lastIndex = 0;

        int lastIndex2 = 0;

        int countFirst = 0;

        int countSecond = 0;

        while(lastIndex != -1) {

            lastIndex = strOne.indexOf(strLetterSearch, lastIndex);

            if (lastIndex != -1) {

                countFirst++;

                lastIndex += strLetterSearch.length();
            }
        }

        while(lastIndex2 != -1) {

            lastIndex2 = strTwo.indexOf(strLetterSearch, lastIndex2);

            if (lastIndex2 != -1) {

                countSecond++;

                lastIndex2 += strLetterSearch.length();
            }
        }

        System.out.println("There are/is " + countFirst  + " of " + strLetterSearch);

        System.out.println("There are/is " + countSecond  + " of " + strLetterSearch);
    }
    public static void largestBy(Scanner read) {

        System.out.println("Please enter a string");

        String line = read.nextLine();

        String [] word = line.split(" ");

        String maxLethWord = "";

        for(int i = 0; i < word.length; i++){

            if(word[i].length() >= maxLethWord.length()){

                maxLethWord = word[i];
            }
        }
        System.out.println(maxLethWord);
    }
    public static void lexLargest(Scanner reader) {

    /*
    Step 1: take a string
    Step 2: take that string ans split
    Step 3: put it into an array of strings
    Step 4: create a for loop that will traverse through the array of strings
    Step 5: take each individual word in that string array integer value
    Step 6: create an 'if/else' statement that will check the value of every word

            if(word1 == word2){
            // do something
            } else if(word1 > 0) {
            // do something
            } else if(word1 < 0) {
            // do something
            }

    Step 7: return the word with the largest numerical value
    Step 8: submit lab7



               */

        System.out.println("Enter a string that you would like to know the lexicographical order of");

        String userLine = reader.nextLine();

        String[] words = userLine.split(" ");

        for(int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].compareTo(words[j]) > 0) {

                    // swap words[i] with words[j[
                    String temp = words[i];

                    words[i] = words[j];

                    words[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");

        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}  // end of class
