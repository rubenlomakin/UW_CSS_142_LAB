package com.company;

public class Main {
    public static void main(String[] args) {

            GiftCard card1 = new GiftCard();

            card1.setBalance(50);

            System.out.print("card 1 value is: ");
            card1.report();

            GiftCard card2 = new GiftCard();

            card2.setBalance(100);
            System.out.print("card 2 value is: ");
            card2.report();

            card2.deduct(101);
            System.out.println(" After deducting $101, card2's new balance is: ");
            card2.report();

            card1.deduct(12.50);
            System.out.println(" After deducting $12.50, card1's new balance is: ");
            card1.report();

            //card1.resetToZero();
            card1.report();
            //card2.resetToZero();
            card2.report();

            // User defined constructor
            GiftCard card3 = new GiftCard(5000);
            System.out.println("\nSetting the new balance to 7500.99 ");
            card3.setBalance(7500.99);

            Pizza pizza1 = new Pizza("medium", 10, 20, 10);
            System.out.println(pizza1.getDescription());


        }

    }
