package com.abhimantras.learning.latihanmvvm.viewmodel;

import android.app.Activity;
import android.content.Intent;

import com.abhimantras.learning.latihanmvvm.utility.Constants;
import com.abhimantras.learning.latihanmvvm.view.LoginView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zul on 6/17/2016.
 */
public class SplashScreenViewModel {

    private Activity activity;

    public SplashScreenViewModel(Activity activity) {
        this.activity = activity;
        initiate();
    }

    private void initiate() {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(activity, LoginView.class);
                activity.startActivity(intent);
                activity.finish();
            }
        }, Constants.SPLASH_SCREEN_TIMER);
    }
}
