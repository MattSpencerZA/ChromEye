package com.example.chromeeye1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    Button callsignup, loginbtn;
    ImageView image;
    TextView logo, slogan;
    TextInputLayout username, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


        callsignup = findViewById(R.id.callsignup);
        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.logo_name);
        slogan = findViewById(R.id.slogan_name);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbtn = findViewById(R.id.login_btn);


        callsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);

              //  Intent intent2 = new Intent(Login.this, Register.class);
              //  Pair[] pairs = new Pair[7];
              //  pairs[0] = new Pair<View, String>(image, "logo_image");
              //  pairs[1] = new Pair<View, String>(logo, "logo_text");
              //  pairs[2] = new Pair<View, String>(slogan, "logo_desc");
              //  pairs[3] = new Pair<View, String>(username, "username_tran");
              //  pairs[4] = new Pair<View, String>(password, "password_tran");
              //  pairs[5] = new Pair<View, String>(loginbtn, "button_tran");
              //  pairs[6] = new Pair<View, String>(callsignup, "login_signup_tran");

              //  ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
              //  startActivity(intent2, options.toBundle());
            }
        });
    }
}