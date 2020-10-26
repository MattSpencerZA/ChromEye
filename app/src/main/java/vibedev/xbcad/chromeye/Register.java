package vibedev.xbcad.chromeye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.chromeeye1.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    TextInputEditText mFullName, mUsername, mEmail, mPhone, mPassword;
    Button loginpage, mRegisterBtn;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        VariableInit();
        fAuth();
        CheckUserLoggedIn();
        Registration();
        RedirectOnclick();
    }

    private void fAuth() {
        fAuth = FirebaseAuth.getInstance();
    }

    private void CheckUserLoggedIn() {
        if(fAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), Login.class));
            finish();
        }
    }

    private void Registration() {
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)) { mEmail.setError("Email is Required!"); return; }
                if(TextUtils.isEmpty(password)) { mPassword.setError("Password is Required!"); return; }
                if(password.length() < 6) { mPassword.setError("Password Must Be >= 6 Characters!"); }

                //register users with Firebase
                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Register.this, "User has been created!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Login.class));
                        } else {
                            Toast.makeText(Register.this, "Error! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    private void VariableInit() {
        mFullName = findViewById(R.id.fullNameReg);
        mUsername = findViewById(R.id.etUNameReg);
        mEmail = findViewById(R.id.EmailReg);
        mPhone = findViewById(R.id.phoneReg);
        mPassword = findViewById(R.id.etPasswReg);
        mRegisterBtn = findViewById(R.id.registerBtnReg);
    }

    private void RedirectOnclick() {
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