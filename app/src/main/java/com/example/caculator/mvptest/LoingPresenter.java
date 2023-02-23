package com.example.caculator.mvptest;

public class LoingPresenter
        extends BasePresenter<LoginContract.LoginView>  implements LoginContract.LoginPresenter {


    public LoingPresenter(){

    }

    @Override
    public void login() {
        view.showSuccessMes();
    }

    @Override
    public void signup() {
        view.showSuccessMes();
    }
}

