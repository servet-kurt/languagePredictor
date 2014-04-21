package English;

import java.util.Arrays;
import java.util.List;

public class EnglishTrigramWords {

	List<String> trigrams = Arrays.asList("THE", "AND", "ING", "ENT", "ION",
			"HER", "FOR", "THA", "NTH", "INT", "TER", "EST", "ERS", "ATI",
			"HAT", "ATE", "ALL", "ETH", "HIS", "OFT", "ITH", "FTH", "STH",
			"OTH", "RES", "ONT", "ERE", "TIO", "HES", "VER");

	public boolean isInTrigram(String word) {
		for (String trigram : trigrams) {
			if (word.contains(trigram)) {
				return true;
			}
		}
		return false;
	}
}
