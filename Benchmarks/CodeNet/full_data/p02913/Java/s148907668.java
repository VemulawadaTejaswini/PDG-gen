import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		do {
			int n = in.nextInt();
			String s = in.next();
			System.out.println(solve(s));
		} while (TEST);
	}

	private static int solve(String s) {
		int n = s.length();
		int m = n / 2;
		for (; m > 0; m--)
			for (int p = 0; n - p - m >= m; p++)
				if (s.substring(p + m, n).contains(s.substring(p, p + m)))
					return m;
		return 0;
	}
}