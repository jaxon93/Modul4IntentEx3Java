package com.example.modul4intentex3java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.modul4intentex3java.modul.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    protected void initView() {
        Button b_open_second = (Button) findViewById(R.id.b_open_second);

        User user = new User(20, "Jakhongir");

        b_open_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(user);
            }
        });

    }

    void openSecondActivity(User user) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}