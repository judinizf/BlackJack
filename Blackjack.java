public class Blackjack{

	public void Main(){

		Deck callDeck = new Deck(2);
		callDeck.printDeck();
		callDeck.shuffleDeck();
		callDeck.printDeck();

		return; 
	}

}