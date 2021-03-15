package question1;

import java.util.Random;

public class Deck{
	
	/* Implements a Deck of cards */

	private static String[] suits = {"clovers", "diamonds", "spades", "hearts"};
	private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
	MyList<Card> myDeck = new MyList<>();


	public Deck(){

		/************************************************************/
		/* constructor, returns empty deck 
		/************************************************************/

	}

	public void Shuffle(){

		/************************************************************/
		/* complete
		/* should shuffle the deck randomly         
		/************************************************************/
		
		Random random = new Random();
		int size = myDeck.numElem();
		for(int i=0; i<size; i++) {
			Card firstCard = myDeck.checkElement(i);
			
			if(i!=0) {
				int r = random.nextInt(myDeck.numElem());
				Card secondCard = myDeck.checkElement(r);
				
				Card temp = firstCard;
				myDeck.insert(i, secondCard);
				myDeck.remove(i+1, firstCard);
				
				myDeck.insert(r, temp);
				myDeck.remove(r+1, secondCard);
			}
		}
		//myDeck.print();
	}


	public void initFullDeck(){

		/************************************************************/
		/* complete 
		/* Should initialize a deck with the 52 cards of a regular  
		/************************************************************/
		
		for(int i=0; i<suits.length; i++) {
			for(int j=0; j<ranks.length; j++) {
				Card a = new Card(suits[i], ranks[j]);
				myDeck.addLast(a);
			}
		}
		
	}


	public int numCards(){

		/************************************************************/
		/* complete 
		/* should return the number of cards in the deck
		/************************************************************/
		
		return myDeck.numElem();
	}


	public boolean isEmpty(){

		/************************************************************/
		/* complete 
		/* should return true if the deck is empty
		/************************************************************/

		return myDeck.isEmpty();
	}
	
	public Card checkElement(int position){
		/******************************************************************/
		/* To be completed
		/* should return (but does not remove) element at any given position
		/******************************************************************/
		return myDeck.checkElement(position);
	}  

	public static void main (String[] args) {
		/*
		Deck deck = new Deck();
		deck.initFullDeck();
		System.out.println(deck.numCards());
		
		deck.Shuffle();
		*/
	}

}