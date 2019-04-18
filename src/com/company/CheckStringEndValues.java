package com.company;

public class CheckStringEndValues {

    public boolean checkStringEndWithSecondString(String inputString, String endString){

        if (inputString.endsWith(endString)){
            return true;
        }else {
            return false;
        }
    }
}
