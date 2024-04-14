package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import static org.junit.Assert.assertTrue;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;

public class GameTest {
    private Card[] hand;

    @Test
    public void twoOfAKindTest() {
        hand = new Card[]{
                new Card(JACK, CLUBS, 11),
                new Card(FIVE, CLUBS, 5),
                new Card(JACK, SPADES, 11),
                new Card(FOUR, DIAMONDS, 4),
                new Card(THREE, SPADES, 3)
        };

        assertTrue("Two of a kind should have matched",Game.twoOfAKind(hand));
    }

    @Test
    public void threeOfAKindTest() {
        hand = new Card[] {
                new Card(JACK, CLUBS, 11),
                new Card(FIVE, CLUBS, 5),
                new Card(JACK, SPADES, 11),
                new Card(JACK, DIAMONDS, 11),
                new Card(TWO, HEARTS, 2)
        };

        assertTrue("Three of a kind should have matched", Game.threeOfAKind(hand));
    }

    @Test
    public void fourOfAKindTest() {
        hand = new Card[] {
                new Card(JACK, CLUBS, 11),
                new Card(FIVE, CLUBS, 5),
                new Card(JACK, SPADES, 11),
                new Card(JACK, DIAMONDS, 11),
                new Card(JACK, HEARTS, 11)
        };

        assertTrue("Four of a kind should have matched", Game.fourOfAKind(hand));
    }

    @Test
    public void fullHouseTest() {
        hand = new Card[]{
                new Card(JACK, CLUBS, 11),
                new Card(FOUR, CLUBS, 5),
                new Card(JACK, SPADES, 11),
                new Card(FOUR, DIAMONDS, 4),
                new Card(JACK, HEARTS, 11)
        };

        assertTrue("Full House should have matched",Game.fullHouse(hand));
    }

    @Test
    public void flushTest() {
        hand = new Card[]{
                new Card(JACK, CLUBS, 11),
                new Card(FIVE, CLUBS, 5),
                new Card(TWO, CLUBS, 2),
                new Card(FOUR, CLUBS, 4),
                new Card(THREE, CLUBS, 3)
        };

        assertTrue("Flush should have matched",Game.flush(hand));
    }

}
