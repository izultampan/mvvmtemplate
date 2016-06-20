package com.abhimantras.learning.latihanmvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.abhimantras.learning.latihanmvvm.R;
import com.abhimantras.learning.latihanmvvm.databinding.ActivityLoginBinding;
import com.abhimantras.learning.latihanmvvm.utility.TextWatcherBinding;
import com.abhimantras.learning.latihanmvvm.viewmodel.LoginViewModel;

/**
 * Created by zul on 6/17/2016.
 */
public class LoginView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        LoginViewModel vm = new LoginViewModel(this);
        binding.setViewModel(vm);
        binding.userName.addTextChangedListener(new TextWatcherBinding(vm.user.userName));
        binding.password.addTextChangedListener(new TextWatcherBinding(vm.user.userPassword));
    }
}
