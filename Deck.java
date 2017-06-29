import java.util.Vector;
import java.lang.Object;

public class Deck{

	Card[] deck;
  private static int deckNum;
  private int nCards;
  private int top;

  public final int DECK_SIZE = 52;

  public Deck(int deckNum){
    this.deckNum = deckNum;
    this.nCards = DECK_SIZE*deckNum;
    this.deck = new Card[nCards];

    CardNames[] cardValues = CardNames.values();
    CardSuit[] cardSuits = CardSuit.values();

    // Iterate through all decks from 1 to 8, inclusive
    for (int i = 0; i < this.deckNum; i++) {
      // Iterate through a single deck deck
      for (int j = 0; j < DECK_SIZE; j++) {
        this.deck[i*DECK_SIZE + j] = new Card(cardValues[j%cardValues.length()], 
        cardSuits[j/cardValues.length()]);
      }
    }
	}

	public Card[] shuffleDeck(){
    List<Card> list = Arrays.asList(deck);
    Collections.shuffle(list);
    top = 0;
		return list.toArray();
  }

  public Card buyCard(){
    return this.deck[top++];
  }

  public void printDeck(){
    for(int i = 0; i < this.nCards; i++){
      System.out.println("CARD MOTHERFUCKER: ", deck[i].name, deck[i].suit);
    }
  }

}