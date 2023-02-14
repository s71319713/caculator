package com.example.caculator.utill;

import android.util.Log;

public class Oper implements Rule {

    private String str;
    private int priority;

    public Oper(String str) {
        this.str = str;
        switch (str) {
            case "+":
            case "-":
                priority = 1;
                break;
            case "*":
            case "/":
                priority = 2;
                break;
            default:
                priority = 0;
                break;
        }
    }

    public double count(double num1, double num2) {
        if (str.equals("+")) {
            return num1 + num2;
        } else if (str.equals("-")) {
            return num1 - num2;
        } else if (str.equals("*")) {
            return num1 * num2;
        } else if (str.equals("/")) {
            return num1 / num2;
        } else {
            return 404.0;
        }
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public void printString() {
        Log.d("ddddd", "printString:queue " + str);
    }
}
