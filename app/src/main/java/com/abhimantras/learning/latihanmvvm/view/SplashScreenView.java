package com.abhimantras.learning.latihanmvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abhimantras.learning.latihanmvvm.R;
import com.abhimantras.learning.latihanmvvm.databinding.ActivitySplashScreenBinding;
import com.abhimantras.learning.latihanmvvm.viewmodel.SplashScreenViewModel;

public class SplashScreenView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashScreenBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen);
        binding.setViewModel(new SplashScreenViewModel(this));
    }
}
