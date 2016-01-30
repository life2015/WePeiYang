package com.twt.service.ui.login;

import com.twt.service.bean.Login;

import retrofit.RetrofitError;

/**
 * Created by sunjuntao on 16/1/1.
 */
public interface OnLoginCallback {
    void onSuccess(String loginString);
    void onFailure(RetrofitError retrofitError);
}
