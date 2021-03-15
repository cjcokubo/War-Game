package question1;

/*************************************************************************************/
//Card.java 
//
//implements a simple French-suited card game. Ranks go from 2 to 14, the highest  
//4 cards being the Jack, Queen, King and Ace (Ace being the higest card)
//The game contains 4 suits: clovers, diamonds, spades and hearts. 
//
//*************************************************************************************/


public class Card{
	

	private static String[] suits = {"clovers", "diamonds", "spades", "hearts"};
	private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" }; 


	public String cardSuit;
	public String cardRank;

	// constructor 

	public Card(String suit, String rank){

		cardSuit = suit;
		cardRank = rank; 

	}

	// Accessor Methods


	public String getRank(){

		return cardRank;

	}

	public String getSuit(){

		return cardSuit;

	}

	public String whichCard(){

		return cardRank + "of" + cardSuit;

	}

	// used to compare the cards 

	public boolean isStrongerThan(Card c){

		/* returns True if the current card is stronger than c */
		//int value_c = Integer.parseInt(c.cardRank);  
		//int myValue = Integer.parseInt(cardRank);  
		int value_c = 0;
		int myValue = 0;

		switch (c.cardRank){
		case "2":
			value_c = 2;
			break;
		case "3":
			value_c = 3;
			break;
		case "4":
			value_c = 4;
			break;
		case "5":
			value_c = 5;
			break;
		case "6":
			value_c = 6;
			break;
		case "7":
			value_c = 7;
			break;
		case "8":
			value_c = 8;
			break;
		case "9":
			value_c = 9;
			break;
		case "10":
			value_c = 10;
			break;
		case "Jack":
			value_c = 11;
			break;
		case "Queen":
			value_c = 12;
			break;
		case "King":
			value_c = 13;
			break; 
		case "Ace":
			value_c = 14;
			break;
		}
		
		switch (this.cardRank){
		case "2":
			myValue = 2;
			break;
		case "3":
			myValue = 3;
			break;
		case "4":
			myValue = 4;
			break;
		case "5":
			myValue = 5;
			break;
		case "6":
			myValue = 6;
			break;
		case "7":
			myValue = 7;
			break;
		case "8":
			myValue = 8;
			break;
		case "9":
			myValue = 9;
			break;
		case "10":
			myValue = 10;
			break;
		case "Jack":
			myValue = 11;
			break;
		case "Queen":
			myValue = 12;
			break;
		case "King":
			myValue = 13;
			break; 
		case "Ace":
			myValue = 14;
			break;
		}
		boolean result = myValue > value_c;
		return result;
	}


	public boolean isEqual(Card c){

		int value_c = 0;
		int myValue = 0;

		switch (c.cardRank){
		case "2":
			value_c = 2;
			break;
		case "3":
			value_c = 3;
			break;
		case "4":
			value_c = 4;
			break;
		case "5":
			value_c = 5;
			break;
		case "6":
			value_c = 6;
			break;
		case "7":
			value_c = 7;
			break;
		case "8":
			value_c = 8;
			break;
		case "9":
			value_c = 9;
			break;
		case "10":
			value_c = 10;
			break;
		case "Jack":
			value_c = 11;
			break;
		case "Queen":
			value_c = 12;
			break;
		case "King":
			value_c = 13;
			break; 
		case "Ace":
			value_c = 14;
			break;
		}
		
		switch (this.cardRank){
		case "2":
			myValue = 2;
			break;
		case "3":
			myValue = 3;
			break;
		case "4":
			myValue = 4;
			break;
		case "5":
			myValue = 5;
			break;
		case "6":
			myValue = 6;
			break;
		case "7":
			myValue = 7;
			break;
		case "8":
			myValue = 8;
			break;
		case "9":
			myValue = 9;
			break;
		case "10":
			myValue = 10;
			break;
		case "Jack":
			myValue = 11;
			break;
		case "Queen":
			myValue = 12;
			break;
		case "King":
			myValue = 13;
			break; 
		case "Ace":
			myValue = 14;
			break;
		}


		return myValue == value_c ;

	}

	public static String[] getSuits() {
		return suits;
	}

	public static void setSuits(String[] suits) {
		Card.suits = suits;
	}

	public static String[] getRanks() {
		return ranks;
	}

	public static void setRanks(String[] ranks) {
		Card.ranks = ranks;
	}

}