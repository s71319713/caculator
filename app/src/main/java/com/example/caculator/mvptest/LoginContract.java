package com.example.caculator.mvptest;

public interface LoginContract {
    interface LoginView extends BaseContract.BaseView{
        void showSuccessMes();

    }
    interface LoginPresenter extends BaseContract.BasePresenter{
        void login();
        void signup();
    }
}
