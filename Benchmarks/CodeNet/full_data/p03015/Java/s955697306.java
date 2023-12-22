import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		if (TEST)
			System.out.println(testSolve(s));
		in.close();
	}

	private static int testSolve(String s) {
		int ss = 0;
		for (int i = 0; i < s.length(); i++) {
			ss *= 2;
			if (s.charAt(i) == '1')
				ss++;
		}
		int r = 0;
		for (int a = 0; a <= ss; a++)
			for (int b = 0; a + b <= ss; b++)
				if ((a + b) == (a ^ b))
					r++;
		return r % 1000000007;
	}

	private static long solve(String s) {
		long ra = 1;
		long re = 1;
		for (int i = 0; i < s.length(); i++) {
			ra *= 3;
			if (s.charAt(i) == '1')
				re *= 2;
			else {
				ra -= re * 2;
				while (ra < 0)
					ra += 1000000007;
			}
			ra %= 1000000007;
			re %= 1000000007;
		}
		return ra;
	}
}