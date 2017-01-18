package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 18/01/2017.
 */

public class RPSGameActivity extends AppCompatActivity{

    Button rock;
    Button paper;
    Button scissors;
    Intent intent;
    RPSGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = (Button) findViewById(R.id.rock_button);
        paper = (Button) findViewById(R.id.paper_button);
        scissors = (Button) findViewById(R.id.scissors_button);

        game = new RPSGame();
        String computerChoice = game.getComputerChoice();
        Log.d(getClass().toString(), computerChoice);

        intent = new Intent(RPSGameActivity.this, ResultActivity.class);
        intent.putExtra("computerChoice", computerChoice);
    }

    public void onRockButtonPressed(View button){
        Log.d(getClass().toString(), "Rock button pressed");

        String resultMessage = game.playGame("Rock");
        intent.putExtra("playerChoice", "Rock");
        intent.putExtra("resultMessage", resultMessage);

        startActivity(intent);
    }

    public void onPaperButtonPressed(View button){
        Log.d(getClass().toString(), "Paper button pressed");

        String resultMessage = game.playGame("Paper");
        intent.putExtra("playerChoice", "Paper");
        intent.putExtra("resultMessage", resultMessage);

        startActivity(intent);
    }

    public void onScissorsButtonPressed(View button){
        Log.d(getClass().toString(), "Scissors button pressed");

        String resultMessage = game.playGame("Scissors");
        intent.putExtra("playerChoice", "Scissors");
        intent.putExtra("resultMessage", resultMessage);

        startActivity(intent);
    }

    @Override
    public void onRestart() {  //when restart the page
        super.onRestart(); //call normal restart stuff from android
        finish();
        startActivity(getIntent()); //re-gets implicit intent, so acts like it was just launched
    }

}
