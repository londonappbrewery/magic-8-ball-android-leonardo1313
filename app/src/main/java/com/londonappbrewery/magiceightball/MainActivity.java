package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button askButton;
    private TextView titleTextView;
    private ImageView eightBallImage;
    final int[] ballArray = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eightBallImage = findViewById(R.id.image_eightBall);
        askButton = findViewById(R.id.ask_button);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int ballNumber = randomNumberGenerator.nextInt(5);

                eightBallImage.setImageResource(ballArray[ballNumber]);
            }
        });

    }
}
