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
