package com.example.goshop;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView t_shirt,dress,sweater;
    private ImageView glasses,handbag,hat;
    private ImageView headphone,mobile,laptop;
    private ImageView shoes,watch,pants;
    private ImageView tv,furniture,airconditioner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        t_shirt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAdd);
            }
        });
    }
}