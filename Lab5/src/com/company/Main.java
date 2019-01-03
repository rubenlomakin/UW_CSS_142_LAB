package com.company;

import java.util.Scanner;
import java.util.*;

/**
 * Description of this class here
 */


public class Main {

   public static void main(String[] args) {
   
      Scanner reader = new Scanner(System.in);
   
      menuSwitch();
              
      do {
         int userChoice = reader.nextInt();
         switch (userChoice) {
            case 1:
               getRichQuick();
               break;
            case 2:
               System.out.println("Please enter a number:");
               double x = reader.nextDouble();
               eTaylor(x);
               double taylorResult = eTaylor(x);
               System.out.println(taylorResult);
               break;
            case 3:
               palindromeCheck(reader);
               break;
            case 0:
               quit();
               break;
         
            default:
               System.out.println("Invalid input");
         }
      } while (true); 
   }

    // Part 2
   public static double eTaylor(double x) {
    
      double taylorNum = 0.0; 
           
    // your logic goes here 
    
      for(int i = 0; true; i++) { 
      
         taylorNum += (eTaylorHelper(x,i)); 
         
         if(eTaylorHelper(x, i) < 10e-16) { 
         
            break; 
         } 
      
      }
      
      return taylorNum; 
   }


   public static double eTaylorHelper(double x, int n){
        
      double power = 1;
      double factorial = 1;
      for(int i = 1; i <= n; i++){
         power = power * x;
         factorial = factorial * i;
      }
      return power / factorial;
   }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    // Part 3

    /**
     * This program reads words, identifies, counts and writes all the palindromes and the total
     * palindrome count.
     * <p>
     * // hint 1: Using keybord.next() will only return what comes before a space.
     * // hint 2: Using keybord.nextLine() automatically reads the entire current line.
     */
   public static void palindromeCheck(Scanner reader){
   
      System.out.println("Enter string to reverse:");
   
      Scanner read = new Scanner(System.in);
   
      String str = read.next();
   
      String reverse = "";
   
   
      for (int i = str.length() - 1; i >= 0; i--) {
      
         reverse = reverse + str.charAt(i);
      }
   
      if (str.equalsIgnoreCase(reverse)) {
      
         System.out.println(str + " the reverse is " + reverse + " palindrome ");
      
      
      } else {
         System.out.println(str + " the reverse is " + reverse + " not a palindrome ");
      
      }
   
   }


   public static void quit() {
   
      System.out.println("u lazzy ");
   }

   public static void menuSwitch() {
   
      System.out.println("Enter 1 to get rich");
      System.out.println("Enter 2 to find the log of a number ");
      System.out.println("Enter 3 to see if a word is a palindrome");
      System.out.println("Enter 0 to quit");
   
   }
   
   
   
   
       // Part 1
   public static void getRichQuick() {
      double newTotal = 0.0;
      for (int i = 1; i <= 33; i++) {
         for (double j = newTotal; j <= 10.0; j += newTotal) {
            newTotal = newTotal + (1 + (newTotal / 2));
         }
         newTotal = Math.round(newTotal * 100.0) / 100.0;
         System.out.println("Day " + i + " $" + newTotal);
      }
   }

}



















// 
//         number  = reader.nextDouble();
// 
//         int k = 10;
// 
//         double sum = 1;
// 
//         for (int i = k - 1; i > 0; i--) {
// 
//             sum = 1 + number * (sum / i);
// 
//         }
// 
//         System.out.println("e^x = " + sum);
// return number; 
//     }