package German;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class GermanTrigramWords {

	public double trigramCounter(String word) {

		for (String trigram : trigrams.keySet()) {
			if (word.toUpperCase().indexOf(trigram) != -1) {
				return StringUtils.countMatches(word.toUpperCase(), trigram)*trigrams.get(trigram);
			}
		}
		return 0;
	}
	@SuppressWarnings("serial")
	Map<String,Double> trigrams = new HashMap<String, Double>()
	{
	    {
	        put("DER", 1.04);
	        put("EIN", 0.83);
	        put("SCH", 0.76);
	        put("ICH", 0.75);
	        put("NDE", 0.72);
	        put("DIE", 0.62);
	        put("INE", 0.48);
	        put("TER", 0.44);
	        put("GEN", 0.44);
	        put("END", 0.44);
	        put("ERS", 0.42);
	        put("STE", 0.42);
	        put("BER", 0.36);
	        put("ENS", 0.36);
	        put("NGE", 0.35);
	        put("RDE", 0.35);
	        put("VER", 0.34);
	        put("EIT", 0.33);
	        put("CHE", 0.58);
	        put("DEN", 0.56);
	        put("TEN", 0.51);
	        put("UND", 0.48);
	        put("CHT", 0.41);
	        put("UNG", 0.39);
	        put("DAS", 0.38);
	        put("ERE", 0.38);
	        put("HEN", 0.31);
	        put("ERD", 0.30);
	        put("REI", 0.30);
	        put("IND", 0.29);
	    }
	};

}
