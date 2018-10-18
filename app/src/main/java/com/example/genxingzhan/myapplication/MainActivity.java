package com.example.genxingzhan.myapplication;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button matherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matherButton = (Button) findViewById(R.id.buttonMather);
        matherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMenuMather();
            }
            });
        }

        public void openActivityMenuMather(){
            Intent intent = new Intent (this, MenuMatherActivity.class);
            startActivity(intent);
        }
    }

