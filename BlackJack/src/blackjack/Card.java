/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author juvest
 */

/*enum CardValue{
    ACE (1),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    JACK (10),
    QUEEN (10),
    KING (10);

    public final int value;
    CardValue(int value){ this.value = value; }
}

enum CardSuit{
    
    SPADES (1),
    HEARTS (2),
    DIAMONDS (3),
    CLUBS (4);

    public final int value;
    CardSuit(int value){ this.value = value; }
}*/

public class Card {
    private final int suit;
    private final int cardValue;
    
    public Card(int cardValue, int suit){

        if(cardValue >= 11 && cardValue <= 13)
            cardValue = 10;

    	this.cardValue = cardValue; 
    	this.suit = suit;
    }
    
    public int getValue(){
        return cardValue;
    }
    
    /*public String getCardString(){
        switch(this.cardValue)
    }*/
}
