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

        t_shirt = (ImageView) findViewById(R.id.t_shirt);
        dress = (ImageView) findViewById(R.id.dress);
        sweater = (ImageView) findViewById(R.id.sweater);

        glasses = (ImageView) findViewById(R.id.glasses);
        handbag = (ImageView) findViewById(R.id.handbag);
        hat = (ImageView) findViewById(R.id.hat);

        headphone = (ImageView) findViewById(R.id.headphone);
        mobile = (ImageView) findViewById(R.id.mobile);
        laptop = (ImageView) findViewById(R.id.laptop);

        shoes = (ImageView) findViewById(R.id.shoes);
        watch = (ImageView) findViewById(R.id.watch);
        pants = (ImageView) findViewById(R.id.pants);

        tv = (ImageView) findViewById(R.id.tv);
        furniture = (ImageView) findViewById(R.id.furniture);
        airconditioner = (ImageView) findViewById(R.id.airconditioner);


        t_shirt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "t_shirt");
                startActivity(intent);
            }
        });

        dress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "dress");
                startActivity(intent);
            }
        });

        sweater.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "sweater");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "glasses");
                startActivity(intent);
            }
        });

        handbag.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "handbag");
                startActivity(intent);
            }
        });

        hat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "hat");
                startActivity(intent);
            }
        });

        headphone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "headphone");
                startActivity(intent);
            }
        });

        mobile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "mobile");
                startActivity(intent);
            }
        });

        laptop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "laptop");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "shoes");
                startActivity(intent);
            }
        });

        watch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "watch");
                startActivity(intent);
            }
        });

        pants.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "pants");
                startActivity(intent);
            }
        });

        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "tv");
                startActivity(intent);
            }
        });

        furniture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "furniture");
                startActivity(intent);
            }
        });

        airconditioner.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "airconditioner");
                startActivity(intent);
            }
        });
    }
}