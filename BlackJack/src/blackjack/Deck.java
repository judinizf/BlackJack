package blackjack;

import java.util.*;
import java.lang.*;

public class Deck{

    private Card[] deck;
    private final int deckNum;
    private final int nCards;
    private int top;

    public final int DECK_SIZE = 52;
    public final int CARD_SIZE = 13;
    public final int SUIT_SIZE = 4;
    
    private int count = 0;

    public Deck(int deckNum){
        this.deckNum = deckNum;
        this.nCards = DECK_SIZE*deckNum;
        this.deck = new Card[nCards];
        this.top = 0;
        
        // Iterate through all decks from 1 to 8, inclusive
        for (int i = 0; i < this.deckNum; i++) {
            for (int j = 1; j <= SUIT_SIZE; j++) {
                for (int k = 1; k <= CARD_SIZE; k++) {
                    deck[count++] = new Card(k,j);
                }
            }
        }
    }
    
    public Card[] shuffleDeck(){
        List<Card> list = Arrays.asList(deck);
        Collections.shuffle(list);
        top = 0;
	deck = (Card[]) list.toArray();
        return deck;
    }
    
    @Override
    public void toString(){
        
    }

    public Card buyCard(){
        return this.deck[top++];
    }
}