package com.resilientplc.calculator.task;

import com.resilientplc.calculator.calculation.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    private Calculator cal = new Calculator();
    private String mathOperator;
    private int result;
    private int x;
    private int y;

    public TaskOne() {

        System.out.print("\n************ Task 1 ************\n");
    }

    private int getFirstNumber() {
        return x;
    }

    public void setFirstNumber(Scanner input) throws InputMismatchException {
        x = input.nextInt();
    }

    private int getSecondNumber() {
        return y;
    }

    public void setSecondNumber(Scanner input) throws InputMismatchException {
        y = input.nextInt();
    }

    private String getMathOperator() {

        return mathOperator;
    }

    public void setMathOperator(Scanner input) {

        mathOperator = input.next();

        if (!"+".contentEquals(mathOperator) && (!"-".contentEquals(mathOperator)) && (!"*".contentEquals(mathOperator))
                && (!"/".contentEquals(mathOperator))) {
            //throw new OperatorInputException(" Please enter a valued operator type!");
        }
    }

    public void setResult() {

        switch (getMathOperator()) {
            case "+":
                result = cal.add(getFirstNumber(), getSecondNumber());
                break;
            case "-":
                result = cal.subtract(getFirstNumber(), getSecondNumber());
                break;
            case "*":
                result = cal.multiple(getFirstNumber(), getSecondNumber());
                break;
            case "/":
                result = cal.divide(getFirstNumber(), getSecondNumber());
                break;
        }
    }

    public int getResult() {

        return result;
    }

}