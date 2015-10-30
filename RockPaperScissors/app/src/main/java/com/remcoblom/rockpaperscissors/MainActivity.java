package com.remcoblom.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rockButton, paperButton, scissorsButton;
    private int youScore = 0;
    private int rivalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rockButton = (Button) findViewById(R.id.rockButton);
        Button paperButton = (Button) findViewById(R.id.paperButton);
        Button scissorsButton = (Button) findViewById(R.id.scissorsButton);

        //private int youScore = 0;
        //final int[] rivalScore = {0};

        final TextView youWonYouLose = (TextView) findViewById(R.id.youWonYouLose);
        final TextView result = (TextView) findViewById(R.id.result);
        final TextView youScoreText = (TextView) findViewById(R.id.scoreYou);
        final TextView rivalScoreText = (TextView) findViewById(R.id.scoreRival);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int random = r.nextInt(3);

                switch (random) {
                    case 0: youWonYouLose.setText("It's a tie!");
                        result.setText("You both chose rock!");
                        break;
                    case 1: youWonYouLose.setText("You lost!");
                        result.setText("Rival's paper beats your rock!");
                        rivalScore++;
                        rivalScoreText.setText(String.valueOf(rivalScore));
                        break;
                    case 2: youWonYouLose.setText("You won!");
                        result.setText("Your rock beats Rival's scissors!");
                        youScore++;
                        youScoreText.setText(String.valueOf(youScore));
                        break;
                }
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int random = r.nextInt(3);

                switch (random) {
                    case 0: youWonYouLose.setText("You won!");
                        result.setText("Your paper beats Rival's rock!");
                        youScore++;
                        youScoreText.setText(String.valueOf(youScore));
                        break;
                    case 1: youWonYouLose.setText("It's a tie!");
                        result.setText("You both chose paper!");
                        break;
                    case 2: youWonYouLose.setText("You lost!");
                        result.setText("Rival's scissors beats your paper!");
                        rivalScore++;
                        rivalScoreText.setText(String.valueOf(rivalScore));
                        break;
                }
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int random = r.nextInt(3);

                switch (random) {
                    case 0: youWonYouLose.setText("You lost!");
                        result.setText("Rival's rock beats your paper!");
                        rivalScore++;
                        rivalScoreText.setText(String.valueOf(rivalScore));
                        break;
                    case 1: youWonYouLose.setText("You won!");
                        result.setText("Your scissors beats Rival's paper!");
                        youScore++;
                        youScoreText.setText(String.valueOf(youScore));
                        break;
                    case 2: youWonYouLose.setText("It's a tie!");
                        result.setText("You both chose scissors!");
                        break;
                }
            }
        });
    }
}
