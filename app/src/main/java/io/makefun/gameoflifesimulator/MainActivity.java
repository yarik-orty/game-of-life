package io.makefun.gameoflifesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        gameView = findViewById(R.id.gaveView);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                start();
            }
        });

        gameView.setupPattern(Patterns.random());
    }

    private void start() {
        new CountDownTimer(50000, 100) {
            @Override
            public void onTick(final long millisUntilFinished) {
                gameView.run();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
