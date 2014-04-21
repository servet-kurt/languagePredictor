package Main;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class MainDetector {

	public static void main(String[] args) {
		try{
		InputStream inputStream = MainDetector.class.getResourceAsStream("test.txt");
		String input = IOUtils.toString(inputStream, "UTF-8");
		Trigram trigram = new Trigram();
		trigram.FindTrigramAssociations(input);
	}
		catch(Exception e){
			System.out.println("exception:+"+e.getLocalizedMessage());
			}
		}

}
