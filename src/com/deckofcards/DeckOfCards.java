package com.deckofcards;

import java.util.*;

public class DeckOfCards {
	String[][] playerCards = new String[4][9];// 4players having 9 cards each
	String[] deckCards = new String[52];// total 52 cards
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	/*
	 * cards according to their rank and suits
	 */
	public void Cardsasigned() {
		int dIndex = 0;// Initializing with 0;
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {

				// asigning suits and ranks together
				deckCards[dIndex] = suits[j] + ": " + ranks[i];
				dIndex +=1;
			}
		}
	}

	/*
	 * displaying players cards
	 */
	public void displayCards(String[] deck) {
		int dindex = 0;

		for (int i = 0; i < playerCards.length; i++) {
			System.out.println("The cards of player " + (i + 1) + ": ");
			for (int j = 0; j < playerCards[i].length; j++) {
				playerCards[i][j] = deck[dindex];
				System.out.println(playerCards[i][j]);
				dindex++;
			}
			System.out.println("");
		}
	}

	/*
	 * shuffling of cards
	 */
	public String[] suffleCards() {

		for (int i = 0; i < deckCards.length; i++) {
			Random random = new Random();
			int j = random.nextInt(52);// random numbers from 0 to 52

			// swapping of random data
			String temp = deckCards[i];
			deckCards[i] = deckCards[j];
			deckCards[j] = temp;
		}
		return deckCards;
	}

	public static void main(String[] args) {
		DeckOfCards dc = new DeckOfCards();
		dc.Cardsasigned();
		String[] deck = dc.suffleCards();
		dc.displayCards(deck);

	}
}
