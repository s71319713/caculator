package com.example.caculator.utill;

public class Num implements Rule{
    Double num=0.0;
    public Num(String str){
        this .num = Double.parseDouble(str);
    }

    public Double getDoubble(){
        return num;
    }



    @Override
    public Rule getRule() {
        return null;
    }
}
