package com.example.caculator.mvptest;

public  class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter {
   protected T view;



    @Override
    public void attachView(BaseContract.BaseView baseView) {
        this.view = (T) baseView;
    }

    @Override
    public void detachView() {
        view=null;
    }
}
