package com.example.goshop;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity
{

    private Button LogoutBtn = (Button) findViewById(R.id.logout_btn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LogoutBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view)
            {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}