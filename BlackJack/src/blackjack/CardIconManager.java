/*
 *Nome: Julia Diniz Ferreira
 *Nusp: 9364865
 * 
 *Nome: Vinicius do Nascimento Fontenele
 *Nusp: 9293651
 */

package blackjack;

import javax.swing.ImageIcon;


// Auxiliar enums for getting card names
enum CardValue{
    ace,
    two,
    three,
    four,
    five,
    six,
    seven,
    eight,
    nine,
    ten,
    jack,
    queen,
    king;
}

// Auxiliar enums for getting card names
enum CardSuit{ s, h, d, c; }

public class CardIconManager {

	// Get static references for all cards images
	public static ImageIcon[][] cards = 
		new ImageIcon[Deck.SUIT_SIZE][Deck.CARD_SIZE];
	public static ImageIcon back = new ImageIcon("resources/back.jpg");

	public static ImageIcon startImage = new ImageIcon("resources/start.png");

	public static void loadImages(){

		Image im = startImage.getImage(); // transform it 
		startImage = new ImageIcon(im.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH));  // transform it back
		
		// Get enums as arrays of strings to create path
		CardValue[] cv = CardValue.values();
		CardSuit[] cs = CardSuit.values();

		for(int i = 0; i < Deck.SUIT_SIZE; i++) {
			for(int j = 0; j < Deck.CARD_SIZE; j++) {
				cards[i][j] = new ImageIcon("resources/" + cv[j] + cs[i] + ".jpg");
			}
		}
	}
}