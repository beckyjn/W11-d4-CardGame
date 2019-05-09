import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    @Before
    public void before(){
       deck = new Deck();
       deck.addCards();
    }

//    @Test
//    public void startsWithNoCards() {
//        assertEquals(0, deck.countUnshuffledCards());
//    }

    @Test
    public void addCardsToDeck() {
        assertEquals(52, deck.countUnshuffledCards());
    }

    @Test
    public void cardsAreShuffled(){
        deck.shuffle();
        assertEquals(52, deck.countUnshuffledCards());
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealCard() {
        deck.shuffle();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }
}
