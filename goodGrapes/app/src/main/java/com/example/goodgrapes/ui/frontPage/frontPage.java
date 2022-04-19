package com.example.goodgrapes.ui.frontPage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import com.example.goodgrapes.R;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;

public class frontPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontPage);

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeFragment();
            }
        });
    }

    public void openHomeFragment() {
        Intent intent = new Intent(this, HomeFragment.class);
        startActivity(intent);
    }
}