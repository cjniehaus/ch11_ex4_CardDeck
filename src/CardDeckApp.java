import java.util.Arrays;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
        String[] deck = new String[52];
        String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
        String[] ranks = { "King", "Queen", "Jack", "10", "9", "8", 
        		"7", "6", "5", "4", "3", "2", "Ace" };
        
        int i = 0;
        for (String suit : suits) {
        	for (String rank : ranks) {
        		//System.out.println(rank + " of " + suit);
        		deck[i] = rank + " of " + suit;
        		i++;
        	}
        }
        // add code that creates deck here
        return deck;
    }

    private static void displayCards(String[] cards) {
    	System.out.print("|");
    	for (String card : cards) {
    		System.out.print(card + "|");
    	}
    	System.out.println();
        // add code that displays cards here
    }

    private static void shuffleDeck(String[] deck) {
    	for (int i = 0; i < deck.length; i++) {
    		String savedCard = deck[i];
    		int randomIndex = (int) (Math.random() * deck.length-1);
    		deck[i] = deck[randomIndex];
    		deck[randomIndex] = savedCard;
    	}     
        // add code that shuffles the deck here
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = Arrays.copyOfRange(deck, 0, count);
        return hand;
    }
}