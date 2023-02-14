package com.example.caculator.utill;

public class Oper implements Rule{

    String str="";

    public Oper(String str){
        this.str = str;
    }

    public Double  count(Double num1,Double num2) {
    if(str.equals("+")){
        return num1+num2;
    }
    else if (str.equals("-")){
        return num1-num2;
    }
    else if(str.equals("/")){
        return num1/num2;
    }
    else if(str.equals("*")){
        return num1*num2;
    }
    else {
        return 404.0;
    }
    };

    @Override
    public Rule getRule() {
        return null;
    }
}
