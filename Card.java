public enum CardNames{
	ace = 1,
	two,
	three,
	four,
	five,
	six,
	seven,
	eight,
	nine,
	ten,
	jack = 10,
	queen = 10,
	king = 10;
}

public enum CardSuits{
	spades,
    hearts,
    diamonds,
    clubs;
}

public class Card{
	private final CardSuits suit;
	private final CardNames name;

	public Card(CardSuits suit, int name){
		this.name = name; 
		this.suit = suit;
	}
}