package com.abhimantras.learning.latihanmvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abhimantras.learning.latihanmvvm.R;
import com.abhimantras.learning.latihanmvvm.databinding.ActivityHomeBinding;
import com.abhimantras.learning.latihanmvvm.databinding.ActivitySplashScreenBinding;
import com.abhimantras.learning.latihanmvvm.viewmodel.HomeViewModel;
import com.abhimantras.learning.latihanmvvm.viewmodel.SplashScreenViewModel;

/**
 * Created by zul on 6/17/2016.
 */
public class HomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setViewModel(new HomeViewModel(this));
    }
}
