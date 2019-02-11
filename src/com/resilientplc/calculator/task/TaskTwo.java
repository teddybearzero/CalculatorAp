package com.resilientplc.calculator.task;

import java.util.Scanner;

public class TaskTwo {

    String[] expression;
    private String fullString;
    private String delimiter;

    public TaskTwo() {
        System.out.print("\n********* Task 2 **********\n");
    }

    private String getExpression() {
        return fullString;
    }

    public void setExpression(Scanner input) {
        fullString = input.next();
    }

    public void setDelimiter() {
        delimiter = getDelimiter(getExpression());
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

    public String[] splitString(String string, String delimiter) {

        String[] result = string.split(delimiter);

        int array_length = result.length;

        for (int i = 0; i < array_length; i++) {
            result[i] = result[i].trim();
        }

        return result;
    }

    // Finds the operator the user entered
    public String findMathOperator(String str) {
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

    void setExpression(String fullExpression, String delimiter) {
/*
        int array_length = expression.length;

        for (int i = 0; i < array_length; i++) {
            if (i == 0) {
                x = Integer.parseInt(expression[i]);
            }
            if (i == 1) {
                y = Integer.parseInt(expression[i]);
            }
        }
*/
    }

}
