package vibedev.xbcad.chromeye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chromeeye1.R;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    Button callsignup, loginbtn;
    ImageView image;
    TextView logo, slogan;
    TextInputLayout username, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        CallSignUp();
        OnLoginClick();
    }

    private void OnLoginClick() {
        loginbtn = findViewById(R.id.login_btn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Login.this, Home.class);
                startActivity(intent1);
            }
        });
    }

    private void CallSignUp() {
        callsignup = findViewById(R.id.callsignup);

        callsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
    }
}