package blackjack;

import blackjack.*;
import java.util.Vector;

public class Player {
    private Hand handAux;
    private int pointsAux;
    //private int bet;
    private int money;
    
    public Player(){
        this.pointsAux = 0;
        this.money = 1000;
        this.handAux = new Hand();
    }
    
    public boolean stop(){
        return true;
    }
    
    public void initialHand(){
        handAux.newHand();
    }
    
    public void removeHand(){
        handAux.removeAll();
    }
    
    public void buyCard(){
        handAux.buyCard();
    } 

    public void doubleIt(int bet){
        bet = bet*2;
        //this.handAux.addElement(deck.buyCard());
    }

    public void surrender(int bet){
        bet = bet/2;
    }
    
    public int getPoints(){
        return this.handAux.getPoints();
    }
    
    public String getCards(){
        return handAux.getCards();
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
}
