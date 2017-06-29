public class Hand{
	Deck card;
	Vector<Card> hand = new Vector<Card>(2);
	private int points;

	public Hand(Vector hand, int points){
		this.hand[0] = card.getCard(deck);
		this.hand[1] = card.getCard(deck);
		this.points = 0;	
	}

	public void add(Card c){
    	this.hand.addElement(c);
	}

	public void add(Card c) throws Exception {
    	if(this.points <= 21)
      	this.hand.addElement(c);
    	else throw new Exception();
  	}

	//private Card[] getCard(Card[] deck){
		public Vector<Card> addElement(Vector<Card> hand);
	//}
	

	/*Parar: Se o jogador está satisfeito com sua mão e não quer pedir mais cartas.
	
	Pedir: Se o jogador desejar mais uma carta.
	
	Dobrar: Se o jogador sentir que necessita de UMA e somente UMA carta adicional, 
	então pode dobrar sua aposta e receber mais uma carta, boa ou ruim. Esta opção 
	é oferecida somente nas duas primeiras cartas.
	
	Rendição: Finalmente, o jogador tem a opção de rendição nas primeiras DUAS cartas. 
	Se o jogador não gostar das suas cartas pode perder metade da aposta assim 
	como suas cartas.*/
}
