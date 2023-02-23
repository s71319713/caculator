package com.example.caculator.mvptest;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BaseContract.BasePresenter>
        extends AppCompatActivity implements BaseContract.BaseView {

    //還沒初始化需要交給實現類傳入
    protected T mPresenter;


    public void attachPresenter(T mPresenter){
        this.mPresenter = mPresenter;
        //把接口傳入
        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
