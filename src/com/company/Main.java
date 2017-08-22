package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);

        // First String input
        System.out.println("Enter your first number");

        String num1 = sc.nextLine();
        System.out.println("Enter your second number");
        String num2 = sc.nextLine();


        double firstNum = Double.parseDouble(num1);
        double secondNum = Double.parseDouble(num2);

        System.out.println("Value = " + firstNum);

        // Second String input
        System.out.println("Value = " + secondNum);

        double add = firstNum + secondNum;

        double subtract = firstNum - secondNum;

        double multiply = firstNum * secondNum;

        double divide = firstNum / secondNum;

        double remainder = firstNum % secondNum;

//        I think I understand what the next bit does but I don't know why we use it when it doesn't change the way the program works.
        showresults(add, subtract, multiply, divide, remainder);
    }

        public static void showresults(double add, double subtract, double multiply, double divide, double remainder){

        System.out.println("here is your sum " + add);
        System.out.println("here is your difference " + subtract);
        System.out.println("here is your multiplied value " + multiply);
        System.out.println("here is your divided value " + divide);
        System.out.println("here is your remainder " + remainder);

    }
}
