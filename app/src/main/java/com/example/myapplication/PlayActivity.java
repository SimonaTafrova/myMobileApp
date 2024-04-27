package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PlayActivity extends AppCompatActivity {
    private final int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void playAMove(View v){
        TextView player = findViewById(R.id.player);
        Button button = (Button) v;
        if(player.getText().equals("Player 1")){
            button.setText("X");
            button.setTextSize(55);
            button.setEnabled(false);
           player.setText("Player 2");
        } else {
            button.setText("O");
            button.setTextSize(55);
            button.setEnabled(false);
            player.setText("Player 1");
        }


    }
}