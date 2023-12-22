import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];

		for (int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}

		Arrays.sort(X);

		Integer[] XX = new Integer[M];
		int prev = X[0];
		int now = 0;
		for (int i = 0; i < M; i++) {
			now = X[i];
			XX[i] = Math.abs(now - prev);
			prev = now;
		}

		Arrays.sort(XX, Collections.reverseOrder());

		int result = 0;
		for (int i = N - 1; i < XX.length; i++) {
			result += Math.abs(XX[i]);
		}

		System.out.println(result);

	}
}