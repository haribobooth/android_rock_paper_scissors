package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18/01/2017.
 */
public class RPSGameTest {

    RPSGame game;

    @Before
    public void before(){
        game = new RPSGame();
    }

    @Test
    public void playerCanWin(){
        game.setComputerChoice("Paper");
        assertEquals("YOU ROCK! (or paper, or scissors... basically you win.)", game.playGame("Scissors"));
    }

    @Test
    public void playerCanLose(){
        game.setComputerChoice("Rock");
        assertEquals("LOSER!! (What are you doing with your life?)", game.playGame("Scissors"));
    }

    @Test
    public void playerCanDraw(){
        game.setComputerChoice("Scissors");
        assertEquals("It's a draw... come on, it's only a random number generator!", game.playGame("Scissors"));
    }

    @Test
    public void canGetComputerChoice(){
        game.setComputerChoice("Scissors");
        assertEquals("Scissors", game.getComputerChoice());
    }
}