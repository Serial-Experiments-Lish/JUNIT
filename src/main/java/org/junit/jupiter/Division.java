package org.junit.jupiter;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) throws Exception {
        // int dividedNums = 777 / 7;
        // System.out.println(dividedNums);
        dividedNums();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());

        int numbers = numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + numbers);
    }

    public static int dividedNums() {
        return 777/7;
    }
}