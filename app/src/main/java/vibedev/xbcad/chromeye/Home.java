package vibedev.xbcad.chromeye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.chromeeye1.R;

public class Home extends AppCompatActivity {


    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //intents to respective screens

        //Eye test
        ImageView imageEye = (ImageView) findViewById(R.id.eyeImage);
        imageEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, EyeTest.class);
                startActivity(intent);
            }
        });

        //More Information
        ImageView imageInfo = (ImageView) findViewById(R.id.infoImage);
        imageInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Home.this, Info.class);
                startActivity(intent1);
            }
        });

        //Profile
        ImageView imageProfile = (ImageView) findViewById(R.id.profileImage);
        imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Home.this, Profile.class);
                startActivity(intent2);
            }
        });

        //Contact
        ImageView imageContact = (ImageView) findViewById(R.id.contactImage);
        imageContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Home.this, Contact.class);
                startActivity(intent3);
            }
        });
    }


}