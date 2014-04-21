package Main;

import English.EnglishTrigramWords;

public class Trigram {
		
	private double englishTrigramCount;

	public void FindTrigramAssociations(String input){
		EnglishTrigramWords englishTrigramWords = new EnglishTrigramWords(); 
		String[] words = input.split(" ");
		for(String word:words){
			englishTrigramCount +=englishTrigramWords.trigramCounter(word);
			
		 }
		 System.out.println(englishTrigramCount);
	}
}
