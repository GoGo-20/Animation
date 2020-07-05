package com.example.annimations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView pic1 = (ImageView)findViewById(R.id.pic1);

        ImageView pic2 = (ImageView)findViewById(R.id.pic2);

        pic1.animate().alpha(0f).setDuration(2000);

        pic2.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
