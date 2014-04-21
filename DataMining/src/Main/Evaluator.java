package Main;

public class Evaluator {

	@SuppressWarnings("unused")
	private static double englishPercentage;
	@SuppressWarnings("unused")
	private static double frenchPercentage;
	@SuppressWarnings("unused")
	private static double germanPercentage;

	public static void evaluate(double englishTrigramCount,
			double frenchTrigramCount, double germanTrigramCount) {
		double total = englishTrigramCount+frenchTrigramCount+germanTrigramCount;
		englishPercentage = (100 * englishTrigramCount) / total;
		frenchPercentage = (100 * frenchTrigramCount) / total;
		germanPercentage = (100 * germanTrigramCount) / total;
		System.out.println("English :%" +englishPercentage);
		System.out.println("French :%" +frenchPercentage);
		System.out.println("German :%"+germanPercentage);
		
	}

}
