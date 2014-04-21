package English;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class EnglishTrigramWords {

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
	        put("THE", 1.81);
	        put("AND", 0.73);
	        put("ING", 0.72);
	        put("ENT", 0.42);
	        put("ION", 0.42);
	        put("HER", 0.36);
	        put("FOR", 0.34);
	        put("THA", 0.33);
	        put("NTH", 0.33);
	        put("INT", 0.32);
	        put("TER", 0.30);
	        put("EST", 0.28);
	        put("ERS", 0.28);
	        put("ATI", 0.26);
	        put("HAT", 0.26);
	        put("ATE", 0.25);
	        put("ETH", 0.24);
	        put("ALL", 0.25);
	        put("HIS", 0.24);
	        put("OFT", 0.22);
	        put("ITH", 0.21);
	        put("FTH", 0.21);
	        put("STH", 0.21);
	        put("OTH", 0.21);
	        put("RES", 0.21);
	        put("ONT", 0.20);
	        put("ERE", 0.31);
	        put("TIO", 0.31);
	        put("HES", 0.24);
	        put("VER", 0.24);
	    }
	};

}
