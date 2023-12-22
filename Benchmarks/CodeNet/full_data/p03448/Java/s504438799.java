import java.util.Scanner;

public class Main {

	private static int fiveHundredCoin;

	private static int hundredCoin;

	private static int fiftyCoin;

	private static int totalFare;

	public static void main(String[] args) {

		int result = process();
		System.out.println(result);
	}

	private static int process() {

		scan();
		int combinationCount = 0;

		return count(combinationCount);
	}

	private static void scan() {

		Scanner sc = new Scanner(System.in);
		fiveHundredCoin = sc.nextInt();
		hundredCoin = sc.nextInt();
		fiftyCoin = sc.nextInt();
		totalFare = sc.nextInt();
		sc.close();
	}

	private static int count(int combinationCount) {

		int total = 0;
		for (int i = 0; i <= fiveHundredCoin; i++) {
			for (int j = 0; j <= hundredCoin; j++) {
				for (int k = 0; k <= fiftyCoin; k++) {
					total = (500 * i) + (100 * j) + (50 * k);

					if (totalFare == total) {
						combinationCount++;
					}
				}
			}
		}

		return combinationCount;
	}
}