package com.example.modul4intentex3java;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.modul4intentex3java.modul.User;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    void initView() {
        TextView tv_second = (TextView) findViewById(R.id.tv_second);
        User user = getIntent().getParcelableExtra("user");

        tv_second.setText(user.toString());
    }
}
