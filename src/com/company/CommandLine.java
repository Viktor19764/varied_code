package com.company;

import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {

//Скільки отримано аргументів

        int numberOfArgs = args.length;

        for (int i = 0;i<numberOfArgs; i++){

            System.out.println("I'v got" + args[i]);

        }

        /*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        *//* will wait for input then assign it to the variable,
         * in this case it will wait for an int.
         *//*
        System.out.println(i); // will print the variable*/
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("Enter your name: ");

        // get their input as a String
        String username = scanner.next();

        // prompt for their age
        System.out.print("Enter your age: ");

        // get the age as an int
        int age = scanner.nextInt();

        System.out.println(String.format("%s, your age is %d", username, age));



    }

}
