package com.example.goshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import com.example.goshop.model.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class loginActivity extends AppCompatActivity {
    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton;
    private ProgressDialog lodingBar;
    private TextView AdminLink, NotAdminLink;
    private String parentDbName = "Users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = (Button) findViewById(R.id.login_button);
        InputPassword = (EditText) findViewById(R.id.login_password_input);
        InputPhoneNumber = (EditText) findViewById(R.id.login_phone_number_input);
        AdminLink = (TextView) findViewById(R.id.admin_panel_link);
        NotAdminLink = (TextView) findViewById(R.id.not_admin_panel_link);
        lodingBar = new ProgressDialog(this);
        
        LoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                LoginUser();
            }
        });
        AdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginButton.setText("Login Admin");
                AdminLink.setVisibility(View.INVISIBLE);
                NotAdminLink.setVisibility(View.VISIBLE);
                parentDbName = "Admins";
            }
        });

        NotAdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginButton.setText("Login");
                AdminLink.setVisibility(View.VISIBLE);
                NotAdminLink.setVisibility(View.INVISIBLE);
                parentDbName = "Users";
            }
        });
    }

    private void LoginUser() {
        String phone = InputPhoneNumber.getText().toString();
        String password = InputPassword.getText().toString();
        if(TextUtils.isEmpty(phone)) {
            CharSequence text = "please enter your phone number";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        else if(TextUtils.isEmpty(password)) {
            CharSequence text = "please enter your password";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        else{
            lodingBar.setTitle("login account");
            lodingBar.setMessage("please wait");
            lodingBar.setCanceledOnTouchOutside(false);
            lodingBar.show();
            
            AllowAccessToAccount(phone,password);
        }
    }

    private void AllowAccessToAccount(String phone, String password) {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();
        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.child(parentDbName).child(phone).exists())
                {
                    Users usersdata = snapshot.child(parentDbName).child(phone).getValue(Users.class);
                    if (usersdata.getPhone().equals(phone))
                    {
                        if(usersdata.getPassword().equals(password))
                        {
                            if (parentDbName.equals("Admins"))
                            {
                                Toast.makeText(loginActivity.this, "Welcome admin, login successful", Toast.LENGTH_SHORT).show();
                                lodingBar.dismiss();

                                Intent intent = new Intent(loginActivity.this, AdminCategoryActivity.class);
                                startActivity(intent);
                            }
                            else if (parentDbName.equals("Users"))
                            {
                                Toast.makeText(loginActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                                lodingBar.dismiss();

                                Intent intent = new Intent(loginActivity.this, HomeActivity.class);
                                startActivity(intent);
                            }
                        }
                        else
                        {
                            lodingBar.dismiss();
                            Toast.makeText(loginActivity.this, "incorrect password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                else
                {
                    Toast.makeText(loginActivity.this, "Account with this "+phone+"number does not exist", Toast.LENGTH_SHORT).show();
                    lodingBar.dismiss();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}