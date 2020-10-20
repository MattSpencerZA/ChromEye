package vibedev.xbcad.chromeye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.chromeeye1.R;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText mFullName, mUsername, mEmail, mPhone, mPassword;
    Button loginpage, redirect;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mFullName = findViewById(R.id.fullName);
        mUsername = findViewById(R.id.ETusername);
        mEmail = findViewById(R.id.Email);
        mPhone = findViewById(R.id.phone);
        mPassword = findViewById(R.id.ETpassword);

        fAuth = FirebaseAuth.getInstance();

        LoginOnclick();
    }

    private void LoginOnclick() {
        loginpage = findViewById(R.id.mRedirectBtn);

        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }
        });
    }
}