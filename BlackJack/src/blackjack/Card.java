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
    
    public Card(int cardValue, int suit){

        if(cardValue >= 11 && cardValue <= 13)
            cardValue = 10;

    	this.cardValue = cardValue; 
    	this.suit = suit;
    }
    
    public Card(Card c){
        this.cardValue = c.cardValue;
        this.suit = c.suit;
    }

    public int getValue(){
        return cardValue;
    }

    public int getSuit(){
        return suit;
    }
    
    /*public String getCardString(){
        switch(this.cardValue)
    }*/
}
