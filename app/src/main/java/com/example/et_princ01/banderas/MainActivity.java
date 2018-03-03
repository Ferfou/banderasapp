package com.example.et_princ01.banderas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    RadioGroup migrupo;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.imageView);
        migrupo = findViewById(R.id.groups);
        rb1 = findViewById(R.id.ecuador);
        rb2 = findViewById(R.id.turkia);
        rb3 = findViewById(R.id.canada);
        rb4 = findViewById(R.id.paraguay);

        migrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //Toast.makeText(getApplicationContext(),String.valueOf(i),Toast.LENGTH_LONG).show();
                switch(i)
                {
                    case R.id.ecuador:
                        imagen.setImageResource(R.drawable.ecuador);
                    break;

                    case R.id.turkia:
                        imagen.setImageResource(R.drawable.turkia);
                    break;

                    case R.id.canada:
                        imagen.setImageResource(R.drawable.canada);
                    break;

                    case R.id.paraguay:
                        imagen.setImageResource(R.drawable.paraguay);
                    break;

                }




            }
        });



    }
}
