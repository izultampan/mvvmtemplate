package com.abhimantras.learning.latihanmvvm.viewmodel;

import android.app.Activity;
import android.databinding.ObservableField;

import com.abhimantras.learning.latihanmvvm.R;
import com.abhimantras.learning.latihanmvvm.utility.Constants;

/**
 * Created by zul on 6/17/2016.
 */
public class HomeViewModel {

    private Activity activity;
    public ObservableField<String> userInfo;

    public HomeViewModel(Activity activity) {
        this.activity = activity;
        userInfo = new ObservableField<>();

        userInfo.set(String.format(activity.getString(R.string.main_screen_title),
                activity.getIntent().getStringExtra(Constants.BUNDLE_KEY.USER_NAME),
                activity.getIntent().getStringExtra(Constants.BUNDLE_KEY.USER_TYPE)));
    }
}
