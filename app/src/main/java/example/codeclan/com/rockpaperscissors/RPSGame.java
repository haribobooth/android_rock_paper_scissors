package example.codeclan.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class RPSGame {

    String computerChoice;
    ArrayList<String> choices;



    public RPSGame (){
        this.choices = new ArrayList<String>();
        setupChoices();
        selectComputerChoice();
    }

    private void selectComputerChoice(){
        Random rand = new Random(); //creating random class
        int randomIndex = rand.nextInt(choices.size()); //create random number
        String randomChoice = choices.get(randomIndex); //apply random number to get matching choice
        computerChoice = randomChoice; // label appropriately
    }

    private void setupChoices(){
        String[] choicesToAdd = {  //create array
                "Rock",
                "Paper",
                "Scissors"
        };

        for(String choice : choicesToAdd){ //add to arraylist
            choices.add(choice);
        }
    }

    public String playGame(String playerChoice){
        if((playerChoice == "Rock" && computerChoice == "Scissors") ||
                (playerChoice == "Paper" && computerChoice == "Rock") ||
                (playerChoice == "Scissors" && computerChoice == "Paper")){
           return "YOU ROCK! (or paper, or scissors... basically you win.)";
        }
        else if(playerChoice == computerChoice){
            return "It's a draw... come on, it's only a random number generator!";
        }
        else{
            return "LOSER!! (What are you doing with your life?)";
        }
    }

    //Testing purposes
//    public void setComputerChoice(String computerChoice){
//        this.computerChoice = computerChoice;
//    }

    public String getComputerChoice() {
        return computerChoice;
    }
}
