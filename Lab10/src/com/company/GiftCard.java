package com.company;

/* GiftCard.java
 * CSS161
 *
 * Skeleton file for a basic giftcard class; useful to set, report, and
 * manage deductions
 *
 */
public class GiftCard {
    //todo: class-level data goes here
    //double instanceVar1 = 0.0;

    private double balance;



    // Default constructor
    public GiftCard() {
    }

    // Constructor
    public GiftCard(double balance) {

        this.balance = balance;

    }


    //an example method that needs instance data to be declared first
    public void resetToZero(double balance) {

        //currentBalance = 0;

        System.out.println("reset to zero: " /*currentBalance +*/ );
    }

    public void setBalance(double newBalance){
        // this should reset the balance
        // this function should fail on negative input

        this.balance = newBalance;

    }

    public void deduct(double amount){
        // this method should subtract from the balance
        // this function should fail on negative input

        // take the balance and subtract the amount from it

        if(balance - amount == 0) {

            // do something

        }

        if(balance - amount < 0) {

            // do something

        }

        this.balance = balance - amount;

    }

    public void report(){
        // print out the balance
        System.out.println(balance);
    }
}
