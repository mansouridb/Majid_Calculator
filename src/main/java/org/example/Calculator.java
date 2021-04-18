package org.example;

import java.util.*;

public class Calculator {
    private static Object MessageBoxBYesNo;

    //Method for Multiply numbers,
    public static void multiply(double num1, double num2) {
        double result = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    // Method for Division numbers
    public static void division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
    }

    // Method for subtract numbers,
    public static void subtract(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);

    }

    //Method for  Sum numbers,
    public static void sum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
    }

    public static void main(String[] args) {
        char operator;
        double num1, num2, result;
        boolean quit = true;
        while (quit) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the first number");
            num1 = input.nextDouble();

            System.out.println("Please enter the second  number");
            num2 = input.nextDouble();
            if (num2 == 0.0) {
                System.out.println("Invalid value for number2 please correct number!!!!!!!! ");
                num2 = input.nextDouble();
            }
            System.out.println("Select one of them: *, /, +, -");
            operator = input.next().charAt(0);

            if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.print("Invalid operator please use only + or - or / * please select enter correct value again");
                operator = input.next().charAt(0);
            }
            switch (operator) {
                case '*':

                    multiply(num1, num2);
                    break;
                case '/':
                    division(num1, num2);
                    break;
                case '+':
                    sum(num1, num2);
                    break;
                case '-':
                    subtract(num1, num2);
                    break;
                default:
                    System.out.println("Wrong !");
                    break;
            }


            System.out.println(" Do you want to use Calculator, Y/N ?");
            char check = input.next().charAt(0);
            if (check == 'y') {
                quit = true;
            } else {
                quit = false;
            }
        }

    }
}




