/*
 *Nome: Julia Diniz Ferreira
 *Nusp: 9364865
 * 
 *Nome: Vinicius do Nascimento Fontenele
 *Nusp: 9293651
 */

package blackjack;

import java.util.*;
import java.lang.*;

public class Deck{

    private Card[] deck;
    private final int deckNum;
    private final int nCards;
    private int top;

    public static final int DECK_SIZE = 52;
    public static final int CARD_SIZE = 13;
    public static final int SUIT_SIZE = 4;
    
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
    
    public Card[] shuffleDeck(Player p, Dealer d){
        List<Card> list = Arrays.asList(deck);
        Collections.shuffle(list);
        top = 0;
        deck = (Card[]) list.toArray();
        int valueAux;
        int suitAux;        
        
        Vector<Card> phand = p.getHand();
        Vector<Card> dhand = d.getHand();
                
        for(int i=0; i<phand.size(); i++){
            for(int j=0; j<count; j++){
                if(phand.elementAt(i).getValue() == deck[j].getValue() && 
                        phand.elementAt(i).getSuit() == deck[j].getSuit()){
                    valueAux = deck[j].getValue();
                    suitAux = deck[j].getSuit();
                    deck[j].setValue(deck[top].getValue());
                    deck[j].setSuit(deck[top].getSuit());
                    deck[top].setValue(valueAux);
                    deck[top].setSuit(suitAux);
                    top++;
                    break;
                }
            }
        }
        
        for(int i=0; i<dhand.size(); i++){
            for(int j=0; j<count; j++){
                if(dhand.elementAt(i).getValue() == deck[j].getValue() && 
                        dhand.elementAt(i).getSuit() == deck[j].getSuit()){
                    valueAux = deck[j].getValue();
                    suitAux = deck[j].getSuit();
                    deck[j].setValue(deck[top].getValue());
                    deck[j].setSuit(deck[top].getSuit());
                    deck[top].setValue(valueAux);
                    deck[top].setSuit(suitAux);
                    top++;
                    break;
                }
            }
        }
                
        return deck;
    }
    
    public Card buyCard(){
        return new Card(this.deck[top++]);
    }
    
    public int nCards(){
        return (this.count-this.top);
    }
}