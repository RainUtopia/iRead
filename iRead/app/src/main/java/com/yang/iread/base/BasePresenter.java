package com.yang.iread.base;

/**
 * Description:
 * Data: 18-9-6 上午11:36
 *
 * @author: yang
 */
public abstract class BasePresenter<T> implements BaseContract.Presenter<T> {
    protected T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
