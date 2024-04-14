package us.mattgreen.poker;

import java.util.Arrays;

/**
 * This is a utility class consisting of static methods to determine if a hand matches a specific
 * @author  Dr. Green
 * @version 1.0
 */
public class Game {
    /**
     *
     * @param hand An Array of Cards
     * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOFmatches = 0;
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    /***
     *
     * @param hand An Array of Cards
     * @return true if three of a kind, false if not.
     */
    public static boolean threeOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));

        for (int i = 0; i < hand.length - 2; i++) {
            if(hand[i].getFace().equals(hand[i+1].getFace()) && hand[i].getFace().equals(hand[i+2].getFace())) {
                return true;
            }
        }
        return false;
    }

    /***
     *
     * @param hand An Array of Cards
     * @return true if four of a kind, false if not.
     */
    public static boolean fourOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));

        for (int i = 0; i < hand.length - 2; i++) {
            if(hand[i].getFace().equals(hand[i+1].getFace()) && hand[i].getFace().equals(hand[i+2].getFace()) && hand[i].getFace().equals(hand[i+3].getFace())) {
                return true;
            }
        }
        return false;
    }

    /***
     *
     * @param hand An array of cards
     * @return true if either case is true, false if not
     */
    public static boolean fullHouse(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));

        boolean caseOne = hand[0].getFace().equals(hand[1].getFace()) &&
                hand[1].getFace().equals(hand[2].getFace()) &&
                hand[3].getFace().equals(hand[4].getFace());

        boolean caseTwo = hand[0].getFace().equals(hand[1].getFace()) &&
                hand[2].getFace().equals(hand[3].getFace()) &&
                hand[3].getFace().equals(hand[4].getFace());

        return caseOne || caseTwo;

    }

    /***
     *
     * @param hand An Array of Cards
     * @return true if a flush is found, false if not.
     */
    public static boolean flush(Card[] hand) {
        for(int i = 1; i < hand.length; i++) {
            if (!hand[0].getSuit().equals(hand[i].getSuit())) {
                return false;
            }
        }
        return true;
    }

}
