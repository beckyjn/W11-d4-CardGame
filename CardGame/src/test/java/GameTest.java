import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Player player1;
    Player player2;
    Game game;

    @Before
    public void before(){
        game = new Game();
        player1 = new Player("Bob");
        player2 = new Player("Freddie");
        game.addPlayer(player1);
        game.addPlayer(player2);
    }

//    @Test
//    public void addPlayerToGame() {
//        game.addPlayer(player1);
//        assertEquals(1, game.countPlayers());
//    }


    @Test
    public void dealCardsToEveryone() {
        game.dealGame();
        assertEquals(1, player1.countHand());
        assertEquals(1, player2.countHand());
    }

    @Test
    public void canDeclareWinner() {
        game.dealGame();
        assertEquals("Bob wins!", game.checkWinner());
    }
}
