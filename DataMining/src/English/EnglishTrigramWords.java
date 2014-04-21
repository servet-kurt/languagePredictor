package English;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class EnglishTrigramWords {

	List<String> trigrams = Arrays.asList("THE", "AND", "ING", "ENT", "ION",
			"HER", "FOR", "THA", "NTH", "INT", "TER", "EST", "ERS", "ATI",
			"HAT", "ATE", "ALL", "ETH", "HIS", "OFT", "ITH", "FTH", "STH",
			"OTH", "RES", "ONT", "ERE", "TIO", "HES", "VER");

	public int isInTrigram(String word) {

		for (String trigram : trigrams) {
			if (word.toUpperCase().indexOf(trigram) != -1) {
				return StringUtils.countMatches(word.toUpperCase(), trigram);
			}
		}
		return 0;
	}
}
