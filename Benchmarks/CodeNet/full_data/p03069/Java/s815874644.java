import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		scanner.close();

		char[] c = S.toCharArray();

		int[] sumBlack = new int[N+1];
		int[] sumWhite = new int[N+1];

		/*
		 * We add value to sumBlack and sumWhite, so all sumValue of each color is the time when "N".
		 * And shoule think Last time.
		 */
		for (int i = 0; i <= N; i++) {
			sumBlack[i+1] = sumBlack[i] + (c[i] == '#' ? 1: 0);
			sumWhite[i+1] = sumWhite[i] + (c[i] == '.' ? 1: 0);
		}

		// this code is learned by : https://atcoder.jp/contests/tenka1-2019-beginner/submissions/5069772
		// take max value of Integer 
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < N; j++) {
			// add value to sumBlack and sumWhite, so all sumValue of each color is the time when "N".
			min = Math.min(min, (sumBlack[j] + (sumWhite[N] - sumWhite[j])));
		}

		System.out.println(min);

	}

}
