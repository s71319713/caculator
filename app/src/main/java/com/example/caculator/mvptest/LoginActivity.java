package com.example.caculator.mvptest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class LoginActivity
        extends BaseActivity<LoingPresenter> implements LoginContract.LoginView {
    Button loginBtn,signupBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        attachPresenter(new LoingPresenter());

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login();
            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.signup();
            }
        });

    }

    @Override
    public void showSuccessMes() {

    }


    @Override
    public LoingPresenter createPresenter() {
        return new LoingPresenter();
    }
}
