import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			char[] t = in.next().toCharArray();
			Arrays.sort(t);
			s[i] = String.valueOf(t);
		}
		System.out.println(solve(n, s));
		in.close();
	}

	private static long solve(int n, String[] s) {
		boolean[] g = new boolean[n];
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (g[i])
				continue;
			long r = 0;
			for (int j = i + 1; j < n; j++) {
				if (g[j])
					continue;
				if (s[i].equals(s[j])) {
					g[j] = true;
					r++;
				}
			}
			if (r > 0)
				ans += r * (r + 1) / 2;
		}
		return ans;
	}
}
