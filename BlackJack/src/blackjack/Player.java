/*
 *Nome: Julia Diniz Ferreira
 *Nusp: 9364865
 * 
 *Nome: Vinicius do Nascimento Fontenele
 *Nusp: 9293651
 */

package blackjack;

import java.util.Vector;

public class Player {
    private Hand handAux;
    private int pointsAux;
    private int money;
    
    public Player(){
        this.pointsAux = 0;
        this.money = 1000;
        this.handAux = new Hand();
    }
    
    public boolean stop(){
        return true;
    }
    
    public void initialHand(Player p, Dealer d){
        handAux.newHand(p,d);
    }
    
    public void removeHand(){
        handAux.removeAll();
    }
    
    public void buyCard(Player p, Dealer d){
        handAux.buyCard(p,d);
    } 

    public void doubleIt(int bet){
        bet = bet*2;
    }

    public void surrender(int bet){
        bet = bet/2;
    }
    
    public int getPoints(){
        return this.handAux.getPoints();
    }
    
    public String getCards(){
        return null;
    }
    
    public int getMoney(){
        return this.money;
    }
    
    public void loseMoney(int money){
        this.money -= money;
    }
    
    public void winMoney(int money){
        this.money += money;
    }
    
    public Vector<Card> getHand(){
        return handAux.getHand();
    }
    
    public void checkA(){
        handAux.checkA();
    }
}
