package com.resilientplc.calculator.task;

import java.util.Scanner;

public class TaskTwo extends TaskOne {

    private String fullString;
    private int x;
    private int y;

    public TaskTwo() {
        System.out.print("\n********* Task 2 **********\n");
    }

    private String getExpression() {
        return fullString;
    }

    public void setExpression(Scanner input) {
        fullString = input.nextLine();
    }

    // Required to split the string
    private String getDelimiter(String str) {

        if (str.contains("+")) {
            str = "\\++";
        } else if (str.contains("-")) {
            str = "\\-+";
        } else if (str.contains("*")) {
            str = "\\*+";
        } else if (str.contains("/")) {
            str = "\\/+";
        }

        return str;
    }

    private String[] splitString(String string, String delimiter) {

        String[] result = string.split(delimiter);

        int array_length = result.length;

        for (int i = 0; i < array_length; i++) {
            result[i] = result[i].trim();
        }

        return result;
    }

    // Finds the operator the user entered
    public String findOperator(String str) {
        if (str.contains("+")) {
            str = "+";
        } else if (str.contains("-")) {
            str = "-";
        } else if (str.contains("*")) {
            str = "*";
        } else if (str.contains("/")) {
            str = "/";
        }

        return str;
    }

/*
    @Override
    public void showQuestion() {

        String[] expression;
        String delimiter;


        System.out.print("\nPlease enter an expression of type number operator number\n");

        try {
            setExpression();

        } catch (Exception e) {
            System.out.print("Error please !");
        }

        delimiter = getDelimiter(getExpression());
        expression = splitString(fullExpression, delimiter);

        setOperator();

        int array_length = expression.length;

        for (int i = 0; i < array_length; i++) {
            if (i == 0) {
                firstNumber = Integer.parseInt(expression[i]);
            }
            if (i == 1) {
                secondNumber = Integer.parseInt(expression[i]);
            }
        }

        result = setResult();

        // Display the Result
        System.out.print("\nResult: " + getExpression() + " = " + result + "\n");
    }


*/
}
