/** 
 * @author zbekele
 */
//playing Card game
//Fields
//value (contains a value from 2-14 representing cards 2-Ace)
//done through the map in deck
//name (e.g. Ace of Diamonds, or Two of Hearts)


public class Card {
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	public final static int ACE = 14;

	// Two fields are created here, 1.value (contains a value from 2-14 representing cards 2-Ace)
	// 2.name (e.g. Ace of Diamonds, or Two of Hearts)

	private Suit suit;
	private int value;
	
	//Getters and Setters method are created here
	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	//1.a 2. describe method (prints out information about a card)
	public String describe() {
		StringBuilder output = new StringBuilder();

		switch (value) {
		case JACK:
			output.append("J" + " ]");
			break;
		case QUEEN:
			output.append("Q" + " ]");
			break;
		case KING:
			output.append("K" + " ]");
			break;
		case ACE:
			output.append("A" + " ]");
			break;
		case 10:
			//To make it more card like 
			output.append("10" + "]");
			break;
		default:
			output.append(value + " ]");
		}

		return (output.toString());
	}
}