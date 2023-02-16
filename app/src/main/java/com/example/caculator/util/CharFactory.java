package com.example.caculator.util;

import android.util.Log;

import java.util.LinkedList;
import java.util.Queue;

public class CharFactory {
    String num ="";
    Queue<Rule> queue = new LinkedList<>();
    public CharFactory(){}
    public void saveChar(String str){
        if(str.equals("+")||str.equals("-")||str.equals("/")||str.equals("*")){
            queue.offer(new Num(num));
            queue.offer(new Oper(str));
            num="";
        }else {
            num=num+str;
            Log.d("ddddd", "拼接: "+num);
        }
    }

    public void endQueue(){
        queue.offer(new Num(num));
        num="";
    }

    public Queue<Rule> getQueue() {
        return queue;
    }
}
