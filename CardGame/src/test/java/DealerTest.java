import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Player player;
    @Before
    public void before(){
        dealer = new Dealer();
        player = new Player("Bob");

    }

    @Test
    public void startsWithCards() {
        assertEquals(52, dealer.countUnshuffledCards());
    }

    @Test
    public void startsWithShuffledCards() {
        assertEquals(52, dealer.countCards());
    }

    @Test
    public void dealCardToPlayer() {
        dealer.dealCard(player);
        assertEquals(51, dealer.countCards());
    }
}
