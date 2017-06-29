/*
 *Nome: Julia Diniz Ferreira
 *Nusp: 9364865
 * 
 *Nome: Vinicius do Nascimento Fontenele
 *Nusp: 9293651
 */

package blackjack;

public class Card {
    private int suit;
    private int cardValue;
    
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

    @Override
    public String toString(){

        String s = "";

        switch(this.suit){
        case 1:
            s += "S";
            break;
        case 2:
            s += "H";
            break;
        case 3:
            s += "D";
            break;
        case 4:
            s += "C";
            break;
        }

        return (s + Integer.toString(this.cardValue));
    }
    
    public void setValue(int cardValue){
        this.cardValue = cardValue;
    }
    
    public void setSuit(int suit){
        this.suit = suit;
    }
    
}
