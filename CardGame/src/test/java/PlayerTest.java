import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Dealer dealer;

    @Before
    public void before() {
        player = new Player("Billy");
        dealer = new Dealer();

    }

    @Test
    public void doesPlayerHaveCard() {
        dealer.dealCard(player);
        assertEquals(1, player.countHand());
    }
}

