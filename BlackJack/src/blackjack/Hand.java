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
	private int visiblePoints;

	public Hand(){
        this.points = 0;
        this.hand = new Vector<Card>();
    }

    public boolean newHand (Player p, Dealer d){
        /*hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(0)).getValue();
        hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(1)).getValue();
        */
        // buyCard(p,d);
        hand.add(new Card(1, 1));
        buyCard(p,d);

        // Check for Ace or 10, J, Q, K
        Card c1 = hand.get(0);
        Card c2 = hand.get(0);

        // Ace
        if(c1.getValue() == 1){
            if(c2.getValue() == 10){
                c2.setBack(false);
                return true;
            }

        // 10, J, Q, K
        } else if(c1.getValue() == 10){
            if(c2.getValue() == 1){
                c2.setBack(false);
                return true;
            }
        }

        return false;
    }

    public boolean newHand (Player p, Dealer d, boolean isDealerHand){
        buyCard(p,d);
        buyCard(p,d, isDealerHand);

        // Check for Ace or 10, J, Q, K
        Card c1 = hand.get(0);
        Card c2 = hand.get(0);

        // Ace
        if(c1.getValue() == 1){
            if(c2.getValue() == 10)
                return true;

        // 10, J, Q, K
        } else if(c1.getValue() == 10){
            if(c2.getValue() == 1)
                return true;
        }

        return false;
    }
    
    public void buyCard(Player p, Dealer d){

        // Get card from deck and add it to hand
        hand.addElement(mainScreen.deck.buyCard());

        // Update points
        points += ((Card)hand.elementAt(hand.size()-1)).getValue();
        visiblePoints += ((Card)hand.elementAt(hand.size()-1)).getValue();

        if(mainScreen.deck.nCards() == 0){
            mainScreen.deck.shuffleDeck(p,d);
        }
    }
     
    public void buyCard(Player p, Dealer d, boolean isDealerHand){

        // Get card from deck and add it to hand but set its back value to true
        Card c = mainScreen.deck.buyCard();
        c.setBack(true);
        hand.addElement(c);

        // Update only internal points
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
        this.visiblePoints = 0;
        return true;
    }
    
    public int getPoints(){
        return this.points;
    }

    public int getVisiblePoints(){
        return this.visiblePoints; 
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