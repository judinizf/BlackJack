package blackjack;

import java.util.Vector;

public class Dealer {
    private Hand handAux2;
    private int pointsAux2;
    Deck deck;
    
    public Dealer(){
        this.handAux2 = new Hand();
        this.pointsAux2 = 0;
    }
    
    public boolean stop(){
        return true;
    }
    
    public void initialHand(){
        handAux2.newHand();
    }
    /*
    public void askCard(){
        handAux2.buyCard();
    }*/

    public void buyCard(){
        handAux2.buyCard();
    }
    
    public int getPoints(){
        return this.handAux2.getPoints();
    }

    public void removeHand(){
        handAux2.removeAll();
    }
}
