package Main;

import English.EnglishTrigramWords;
import French.FrenchTrigramWords;
import German.GermanTrigramWords;

public class Trigram {

	private double englishTrigramCount;
	private double frenchTrigramCount;
	private double germanTrigramCount;

	public void FindTrigramAssociations(String input) {
		EnglishTrigramWords englishTrigramWords = new EnglishTrigramWords();
		FrenchTrigramWords frenchTrigramWords = new FrenchTrigramWords();
		GermanTrigramWords germanTrigramWords = new GermanTrigramWords();
		String[] words = input.split(" ");
		for (String word : words) {
			englishTrigramCount += englishTrigramWords.trigramCounter(word);
			frenchTrigramCount += frenchTrigramWords.trigramCounter(word);
			germanTrigramCount += germanTrigramWords.trigramCounter(word);
		}
		System.out.println("English " + englishTrigramCount);
		System.out.println("French " + frenchTrigramCount);
		System.out.println("German " + germanTrigramCount);
	}
}
