package com.company;

        import java.util.*;

public class Lab9 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNum1 = random.nextInt(10);
        int randomNum2 = random.nextInt(10);

        sumOfRows(generateArray(randomNum1, randomNum2));
        colSum(generateArray(randomNum1, randomNum2));
        isASquare(randomNum1, randomNum2);

        int[][] latinSquare = {
                {1,2,3},
                {2,3,1},
                {3,2,1}
        };

        isLatinSqaure(latinSquare);


    }
    public static boolean isLatinSqaure(int[][] latinSqaure) {

        Boolean[][] x = new Boolean[latinSqaure.length][latinSqaure.length];

        Boolean[][] y = new Boolean[latinSqaure.length][latinSqaure.length];

        for(int row = 0; row < latinSqaure.length; row++) {

            if(latinSqaure[row].length != latinSqaure.length) {

                return false;
            }
            for(int col = 0; col < latinSqaure.length; col++) {

                int someName = latinSqaure[row][col] -1;

                if(x[row][col] || y[col][someName]) {

                    return false;
                }

                x[row][someName] = y[col][someName] = true;
            }
        }
        return true;
    }

    // GENERATE ARRAY WITH A RANDOM SIZE AND RANDOM VALUES IN ARRAY

    public static int[][] generateArray(int randomNum1, int randomNum2) {

        int[][] arrayTest = new int[randomNum1][randomNum2];

        for (int i = 0; i < arrayTest.length; i++) {

            for (int j = 0; j < arrayTest[i].length; j++) {

                arrayTest[i][j] = (int) (Math.random() * 10);

                System.out.print(arrayTest[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        return arrayTest;
    }

    // RETURN SUM OF THE ROW IN ARRAY

    public static void sumOfRows(int[][] arrayTest) {

        for (int i = 0; i < arrayTest.length; i++) {

            int sumOfRow = 0;

            for (int j = 0; j < arrayTest[0].length; j++) {

                sumOfRow += arrayTest[i][j];
            }

            System.out.println("The sum of row " + (i + 1) + " is: " + sumOfRow);
        }

        System.out.println();

        // create a new array that will take all the sum of every row
    }


    // RETURN SUM OF THE COL IN ARRAY
        /*
        What do we need to find the sum of every column?
        Step 1: We need to find how the column for loop works.
                Start with the beginning of the array
                Start with the beginning of the col
        Step 2. We need to start at column 0
        Step 3. Traverse through the end of the array
        Step 4. Start at row zero and column zero; then go to row 1 col 0
                Go to row 2, col 0.
                Go to row 3, col 0.
                Go to row 4, col 0.
                etc.
                The amount of rows will vary depending on the size the computer will generate
                So we weill want to take tbe the size that the computer both generated for the
                rows and col and go till the end of that.
         Step 5. Declare a variable that will keep track of the sum of each row. This will have to be
                 declared inside the firs of the nested for loops.
         Step 6. Create another for loop that will be responsible through traversing through each and
                 every col.
  */

    public static void colSum(int[][] arrayTest) {

        int index = 0;
        int temp[] = new int[arrayTest[index].length];

        for (int i = 0; i < arrayTest[i].length; i++) {
            int sum = 0;

            for (int j = 0; j < arrayTest.length; j++) {
                sum += arrayTest[j][i];

            }
            temp[index] = sum;
            System.out.println("The sum of column " + (i + 1) + " is: " + sum);
            index++;
        }
    }

    public static Boolean isASquare(int randomNum1, int randomNum2) {

        if (randomNum1 == 0 || randomNum2 == 0) {

            System.out.println("Conditional check");

            return true;

        } else if (randomNum1 == randomNum2) {

            System.out.println("The array is a square");

            return true;

        } else {

            System.out.println("The array is a rectangle");

            return false;
        }
    }

    public static void shiftRight(int[][] arrayTest){
        /*
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

        How is a 2d shift to the right any different from a single dimension

        it is essentially a row shift every time with a different value in x every time

        will this be a nested for loop?

        one for loop to determine how many columns there are in the 2d array
        second for loop to perform an the actual shift
         */

        int x = arrayTest[arrayTest.length - 1][0];

        for(int j = 0; j < arrayTest.length; j++) { // determine how many columns there are in the array

        for(int i = arrayTest.length - 1; i > 0; i--) {

            arrayTest[i] = arrayTest[i-1];

            arrayTest[0][0] = x;
        }
        }
        }
        }
