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

		for (int i = 0; i < N; i++) {
			if (i == 0) {
				sumBlack[i+1] = sumBlack[i] + (c[i] == '#' ? 1: 0);
				sumWhite[i+1] = sumWhite[i] + (c[i] == '.' ? 1: 0);
			}
		}

		// this code is learned by : https://atcoder.jp/contests/tenka1-2019-beginner/submissions/5069772
		// take max value of Integer 
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < N; j++) {
			min = Math.min(min, sumBlack[j] + sumWhite[N-1] - sumWhite[j]);
		}

		System.out.println(min);

	}

}
