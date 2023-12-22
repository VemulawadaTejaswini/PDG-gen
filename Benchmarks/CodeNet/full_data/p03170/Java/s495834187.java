import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean[] dp;
	static int[] choiceArray;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int choiceCount = scan.nextInt();
		int pileCount = scan.nextInt();
		scan.nextLine();

		choiceArray = Arrays.stream(scan.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		dp = new boolean[pileCount + 1];

		for (int i = 0; i < pileCount + 1; i++) {

			for (int choice : choiceArray) {

				if (i >= choice) {

					if (dp[i - choice] == false) {
						dp[i] = true;
						break;
					}
				}
			}
		}

		println(dp[pileCount] ? "First" : "Second");
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
