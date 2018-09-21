package com.seb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int number = input.nextInt();
 //declare a boolean variable called "even" and assign its value to the result from isEven method
//and use the input from the user as an argument
        boolean even = isEven(number);
//declare a boolean variable called "odd" and assign its value to the result from isOdd method
//and use the input from the user as an argument
        boolean odd = isOdd(number);
        System.out.println(number);


        if (even == true) {
// do the next code if the number is even
            do {
                number = (number / 2);
                System.out.println(number);

                if (isOdd(number) && number != 1) {
                    number = ((number * 3) + 1);
                    System.out.println(number);
                }
            } while (number != 1);
        }


        if ((odd == true) && number != 1) {
// do the next code if the number is odd and not equal to 1
 // I did the not equal to 1 because i don't want it to consider 1 as an odd number
 //because the loop has to end when the number reaches 1
            number = ((number * 3) + 1);
            System.out.println(number);
            do {
                number = (number / 2);
                System.out.println(number);

                if (isOdd(number) && number != 1) {
                    number = ((number * 3) + 1);
                    System.out.println(number);
                }

            } while (number != 1);

        }

    }


    public static boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        } else
            return false;

    }

    public static boolean isOdd(int number) {
        if ((number % 2) != 0) {
            return true;

        } else
            return false;
    }

}


