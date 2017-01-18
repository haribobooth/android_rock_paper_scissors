package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 18/01/2017.
 */
public class ResultActivity extends AppCompatActivity {

    TextView playerChoice;
    TextView computerChoice;
    TextView resultMessage;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.result_activity);

        playerChoice = (TextView) findViewById(R.id.player_choice_text);
        computerChoice = (TextView) findViewById(R.id.computer_choice_text);
        resultMessage = (TextView) findViewById(R.id.result_message_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerChoiceString = extras.getString("playerChoice");
        String computerChoiceString = extras.getString("computerChoice");
        String resultString = extras.getString("resultMessage");

        playerChoice.setText("You played: " + playerChoiceString);
        computerChoice.setText("The computer played: " + computerChoiceString);
        resultMessage.setText(resultString);
    }
}
