package com.example.myfirstappblog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            TextView mainTextView=findViewById(R.id.mainTextView);
            mainTextView.setText("Hello Educative.io");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            // activity is destroyed
        }
    }

