import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String sString = scan.nextLine();
		String tString = scan.nextLine();

		int sLength = sString.length();
		int tLength = tString.length();

		String[] dp = new String[sLength];
		Arrays.fill(dp, "");

		char[] sCharArray = sString.toCharArray();
		char[] tCharArray = tString.toCharArray();

		for (int t = 0; t < tLength; t++) {

			for (int s = 0; s < sLength; s++) {

				if (s > 0) {

					if (tCharArray[t] == sCharArray[s]) {

						if (dp[s].length() == dp[s - 1].length()) {

							dp[s] = dp[s - 1] + tCharArray[t];

						} else {

							dp[s] = dp[s] + tCharArray[t];
						}
					} else {

						if (dp[s].length() < dp[s - 1].length()) {

							dp[s] = dp[s - 1];
						}
					}
				} else {

					if (tCharArray[t] == sCharArray[s]) {

						dp[s] = "" + tCharArray[t];
					}
				}
			}
		}

		System.out.println(dp[sLength - 1]);
	}
}
