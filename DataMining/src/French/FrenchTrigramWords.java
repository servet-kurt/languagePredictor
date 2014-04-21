package French;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class FrenchTrigramWords {

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
	        put("ENT", 0.86);
	        put("LES", 0.71);
	        put("ION", 0.56);
	        put("DES", 0.54);
	        put("EDE", 0.52);
	        put("QUE", 0.41);
	        put("EST", 0.49);
	        put("TIO", 0.42);
	        put("ANT", 0.38);
	        put("PAR", 0.37);
	        put("MEN", 0.37);
	        put("ELA", 0.37);
	        put("SDE", 0.37);
	        put("LLE", 0.36);
	        put("OUR", 0.35);
	        put("RES", 0.32);
	        put("SON", 0.31);
	        put("TRE", 0.31);
	        put("ONT", 0.31);
	        put("EUR", 0.31);
	        put("ATI", 0.30);
	        put("UNE", 0.29);
	        put("CON", 0.29);
	        put("EME", 0.28);
	        put("ONS", 0.27);
	        put("ANS", 0.27);
	        put("ESD", 0.27);
	        put("TDE", 0.26);
	        put("NDE", 0.26);
	        put("DEL", 0.37);
	    }
	};

}
