package com.example.saumya_gallary_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     ImageButton prev;
     ImageButton next;
     ImageView sam;
     TextView textView;
     int current = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prev = findViewById(R.id.previous);
        next = findViewById(R.id.next);
        sam = findViewById(R.id.sam1);
        textView = findViewById(R.id.textView);
    }

    public void fn_prev(View v) {
        String idX = "sam" + current;
        int x = this.getResources().getIdentifier(idX, "id" , getPackageName());
        sam.findViewById(x);
        sam.setAlpha(0f);

        current = (5 + current - 1) % 5;
        String idY = "sam" + current;
        int y = this.getResources().getIdentifier(idY, "id" , getPackageName());
        sam.findViewById(y);
        sam.setAlpha(1f);

    }

    public void fn_next(View v) {
        String idX = "sam" + current;
        int x = this.getResources().getIdentifier(idX, "id" , getPackageName());
        sam.findViewById(x);
        sam.setAlpha(0f);

        current = (5 + current + 1) % 5;
        String idY = "sam" + current;
        int y = this.getResources().getIdentifier(idY, "id" , getPackageName());
        sam.findViewById(y);
        sam.setAlpha(1f);
    }
}