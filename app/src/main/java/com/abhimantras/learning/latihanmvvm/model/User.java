package com.abhimantras.learning.latihanmvvm.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by zul on 6/17/2016.
 */
public class User extends BaseObservable {

    public ObservableField<String> userName;
    public ObservableField<String> userPassword;
    public ObservableField<String> userType;

    public User() {
        userName = new ObservableField<>();
        userPassword = new ObservableField<>();
        userType = new ObservableField<>();
    }
}
