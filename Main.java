package com.company;

public class Main {

    public static void main(String[] args) {
        String inputString = "abcd";
        String endString = "a";

        CheckStringEndValues checkStringEndValues = new CheckStringEndValues();
        System.out.println(checkStringEndValues.checkStringEndWithSecondString(inputString, endString));
    }
}
