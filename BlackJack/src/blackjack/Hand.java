package blackjack;

import java.util.Vector;

public class Hand{
    
    private Vector<Card> hand;
	private int points;

	public Hand(){
        this.points = 0;
        this.hand = new Vector<Card>();
    }

    public void newHand (){
        hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(0)).getValue();
        hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(1)).getValue();
    }
    
    public void buyCard(){
        hand.addElement(mainScreen.deck.buyCard());
        points += ((Card)hand.elementAt(hand.size()-1)).getValue();
    }
        
	/*public void add(Card c) throws Exception {
        if(this.points <= 21)
        this.hand.addElement(c);
        else throw new Exception();
  	}*/

  	public boolean removeAll(){
<<<<<<< HEAD
            this.hand = new Vector();
            return true;
        }
        
        public int getPoints(){
            return this.points;
        }
        
        /*public String getCards(){
            
        }*/
=======
        this.hand = new Vector();
        this.points = 0;
        return true;
    }
    
    public int getPoints(){
        return this.points;
    }
>>>>>>> 748ee728367f8d006f06e3401d471fb655eccf7f

}