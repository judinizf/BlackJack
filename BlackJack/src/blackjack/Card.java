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

enum CardValue{
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
}

public class Card {
    private final int suit;
    private final int cardValue;
    /*cards from deck   ace = 1,
                        two = 2,
                        three = 3,
                        four = 4,
                        five = 5,
                        six = 6,
                        seven = 7,
                        eight = 8,
                        nine = 9,
                        ten = 10,
                        jack = 11,
                        queen = 12,
                        king = 13;
    
    suits from deck     spades = 1,
                        hearts = 2,
                        diamonds = 3,
                        clubs = 4;
    */
    
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
