/*
 *Nome: Julia Diniz Ferreira
 *Nusp: 9364865
 * 
 *Nome: Vinicius do Nascimento Fontenele
 *Nusp: 9293651
 */

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
    
    public void initialHand(Player p, Dealer d){
        handAux2.newHand(p,d);
    }
    
    public void buyCard(Player p, Dealer d){
        handAux2.buyCard(p,d);
    }
    
    public int getPoints(){
        return this.handAux2.getPoints();
    }

    public void removeHand(){
        handAux2.removeAll();
    }
    
    public Vector<Card> getHand(){
        return handAux2.getHand();
    }
}
