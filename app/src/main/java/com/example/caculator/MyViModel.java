package com.example.caculator;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViModel extends ViewModel {
    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public MyViModel(){
        //Live引參初始化
        count.setValue(0);
    }


    public LiveData<Integer> getLiveCount(){
        //對外提供引參,用作被觀察對象
        return count;
    }

    public void addCountNum(){
        //對外提供更改Live引參的方法
        Log.d("vvvvv", "addCountNum: "+count);
        count.setValue(count.getValue()+1);
    }

}
