import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		do {
			int n = in.nextInt();
			int k = in.nextInt();
			int q = in.nextInt();
			int[] win = new int[n];
			for (int i = 0; i < q; i++)
				win[in.nextInt() - 1]++;
			for (int i = 0; i < n; i++)
				System.out.println(solve(q, k, win[i]));
		} while (TEST);
	}

	private static String solve(int q, int k, int win) {
		if (k - q + win > 0)
			return "Yes";
		return "No";
	}
}