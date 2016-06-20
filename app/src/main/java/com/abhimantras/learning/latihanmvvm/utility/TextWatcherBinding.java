package com.abhimantras.learning.latihanmvvm.utility;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by zul on 6/17/2016.
 */
public class TextWatcherBinding implements TextWatcher {

    private ObservableField<String> text;

    public TextWatcherBinding(ObservableField<String> text) {
        this.text = text;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        text.set(s.toString());
    }
}
