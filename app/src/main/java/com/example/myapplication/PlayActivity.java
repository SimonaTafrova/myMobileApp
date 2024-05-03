package com.example.myapplication;

import android.annotation.SuppressLint;
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
    private int counterO= 0;
    private int counterX = 0;

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

    @SuppressLint("SetTextI18n")
    public void playAMove(View v){
        TextView player = findViewById(R.id.player);
        Button button = (Button) v;
        TextView winner = findViewById(R.id.winner);
        if(player.getText().equals("Player 1")){
            button.setText("X");
           player.setText("First player");
           counterX++;
        } else {
            button.setText("O");
            player.setText("Second player");
            counterO++;
        }

        button.setTextSize(60);
        button.setEnabled(false);

        if(counterX + counterO == 9){
            if(counterX > counterO){
                winner.setText("Player 1 wins!");
            } else {
                winner.setText("Player 2 wins!");
            }
        }




    }
}