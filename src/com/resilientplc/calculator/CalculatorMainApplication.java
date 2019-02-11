package com.resilientplc.calculator;

import com.resilientplc.calculator.task.TaskOne;
import com.resilientplc.calculator.task.TaskTwo;

import java.util.Scanner;

public class CalculatorMainApplication {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        TaskOne();
        TaskTwo();
    }

    static private void TaskOne()
    {
        TaskOne t1 = new TaskOne();

        System.out.print("\nPlease enter your First number: ");
        t1.setFirstNumber(input);

        System.out.print("\nPlease enter the math Operator: ");
        t1.setMathOperator(input);

        System.out.print("\nPlease enter your Second number: ");
        t1.setSecondNumber(input);

        t1.setResult();

        System.out.print("\nThe Result is: " + t1.getResult() + "\n");
    }

    static private void TaskTwo()
    {
        TaskTwo t2 = new TaskTwo();

        System.out.print("\nPlease enter a full Mathematical expression\n");
        t2.setExpression(input);

        //t2.setResult();

        //System.out.print("The Result is: " + t2.getResult());

    }

}




