package com.example.caculator.mvptest;

public interface BaseContract {
    interface BaseView{

    }
    interface BasePresenter{

        void attachView (BaseView baseView);
        void detachView();
    }
}
