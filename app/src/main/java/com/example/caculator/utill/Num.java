package com.example.caculator.utill;

import android.util.Log;

public class Num implements Rule{
    Double num=0.0;
    public Num(String str){
        this .num = Double.parseDouble(str);
    }

    public Double getDoubble(){
        return num;
    }





    @Override
    public void printString() {
        Log.d("ddddd", "printString:queue "+num);
    }
}
