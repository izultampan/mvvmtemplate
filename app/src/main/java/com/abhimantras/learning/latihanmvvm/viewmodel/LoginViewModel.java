package com.abhimantras.learning.latihanmvvm.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import com.abhimantras.learning.latihanmvvm.model.User;
import com.abhimantras.learning.latihanmvvm.utility.Constants;
import com.abhimantras.learning.latihanmvvm.view.HomeView;
import com.abhimantras.learning.latihanmvvm.view.LoginView;

import java.util.ArrayList;

/**
 * Created by zul on 6/17/2016.
 */
public class LoginViewModel {

    private Activity activity;
    public User user;

    private ArrayList<User> userList;
    public ObservableField<String> found;

    public LoginViewModel(Activity activity) {
        this.activity = activity;
        user = new User();
        found = new ObservableField<>();

        userList = new ArrayList<>(3);
        User userSample = new User();
        userSample.userName.set("user");
        userSample.userPassword.set("user");
        userSample.userType.set("user");
        userList.add(0, userSample);

        userSample = new User();
        userSample.userName.set("admin");
        userSample.userPassword.set("admin");
        userSample.userType.set("admin");
        userList.add(1, userSample);

        userSample = new User();
        userSample.userName.set("super_admin");
        userSample.userPassword.set("super_admin");
        userSample.userType.set("super_admin");
        userList.add(2, userSample);
    }

    public void onBtnOkClicked(View view) {
        if (user.userName.get() == null || user.userName.get().isEmpty() ||
                user.userPassword.get() == null || user.userPassword.get().isEmpty())
        {
            found.set("Field can not be empty");
        }
        else
        {
            boolean isFound = false;
            for (User s : userList)
            {
                if (user.userName.get().equalsIgnoreCase(s.userName.get()) &&
                        user.userPassword.get().equalsIgnoreCase(s.userPassword.get()))
                {
                    isFound = true;
                    Intent intent = new Intent(activity, HomeView.class);
                    intent.putExtra(Constants.BUNDLE_KEY.USER_NAME, s.userName.get());
                    intent.putExtra(Constants.BUNDLE_KEY.USER_TYPE, s.userPassword.get());
                    activity.startActivity(intent);
                    activity.finish();
                    return;
                }
            }

            if (!isFound) {
                found.set(String.format("User %s not found", user.userName.get()));
            }
        }
    }

    public void onBtnCancelClicked(View view) {
        user.userName.set("");
        user.userPassword.set("");
        found.set("");
    }
}
