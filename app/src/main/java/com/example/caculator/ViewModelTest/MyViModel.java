package com.example.caculator.ViewModelTest;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViModel extends ViewModel {
    private MutableLiveData<Integer> count = new MutableLiveData<>();
    //宣告一個可變Live引參

    public MyViModel(){
        //Live引參初始化
        count.setValue(0);
    }


    public LiveData<Integer> getLiveCount(){
        //對外提供引參,用作被觀察對象(提供不可變型態的引參,防止外部修改內容,
        // LiveData是MutableLiveData的父類,也可以被觀察(應該說被觀察的方法來源於LiveData))
        return count;
    }

    public void addCountNum(){
        //對外提供更改Live引參的方法
        Log.d("vvvvv", "addCountNum: "+count);
        count.setValue(count.getValue()+1);
    }

}
