/*
 *Nome: Julia Diniz Ferreira
 *Nusp: 9364865
 * 
 *Nome: Vinicius do Nascimento Fontenele
 *Nusp: 9293651
 */

package blackjack;

import java.util.Vector;

public class Hand{
    
    private Vector<Card> hand;
	private int points;

	public Hand(){
        this.points = 0;
        this.hand = new Vector<Card>();
    }

    public void newHand (Player p, Dealer d){
        /*hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(0)).getValue();
        hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(1)).getValue();
        */
        buyCard(p,d);
        buyCard(p,d);
    }
    
    public void buyCard(Player p, Dealer d){
        hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(hand.size()-1)).getValue();
        if(mainScreen.deck.nCards() == 0){
            mainScreen.deck.shuffleDeck(p,d);
        }
    }
        
	/*public void add(Card c) throws Exception {
        if(this.points <= 21)
        this.hand.addElement(c);
        else throw new Exception();
  	}*/

    public boolean removeAll(){

        this.hand = new Vector<Card>();
        this.points = 0;
        return true;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public Vector<Card> getHand(){
        return this.hand;
    }
    
    public void checkA(){
        if(hand.size() == 2){
            if(hand.elementAt(0).getValue() == 1 && hand.elementAt(1).getValue() == 10){
                hand.elementAt(0).setValue(11);
                points += 10;
            }
            if(hand.elementAt(0).getValue() == 10 && hand.elementAt(1).getValue() == 1){
                hand.elementAt(1).setValue(11);
                points += 10;
            }
            
        }
    }
}