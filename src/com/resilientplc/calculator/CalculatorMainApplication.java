package com.resilientplc.calculator;

import com.resilientplc.calculator.task.TaskOne;

import java.util.Scanner;


public class CalculatorMainApplication {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        TaskOne a = new TaskOne();

        System.out.print("\nPlease enter your First number: ");
        a.setFirstNumber(input);

        System.out.print("\nPlease enter the math Operator: ");
        a.setMathOperator(input);

        System.out.print("\nPlease enter your Second number: ");
        a.setSecondNumber(input);

        a.setResult();

        System.out.print("\nThe Result is: " + a.getResult());

    }
}




