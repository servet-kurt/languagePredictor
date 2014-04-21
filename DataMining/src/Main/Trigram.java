package Main;

import English.EnglishTrigramWords;

public class Trigram {
		
	public void FindTrigramAssociations(String input){
		EnglishTrigramWords englishTrigramWords = new EnglishTrigramWords(); 
		String[] words = input.split(" ");
		 for(String word:words){
			 System.out.println(englishTrigramWords.isInTrigram(word));
		 }
		 
	}
}
