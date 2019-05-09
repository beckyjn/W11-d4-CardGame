import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;
    @Before
    public void before(){
        card = new Card(Suit.DIAMONDS, Rank.JACK);
    }

    @Test
    public void cardHasSuit() {
        assertEquals(Suit.DIAMONDS, card.getSuit());
    }

    @Test
    public void cardHasType() {
        assertEquals(Rank.JACK, card.getType());
    }

    @Test
    public void cardHasValue() {
        assertEquals(10, card.getValue());
    }
}
