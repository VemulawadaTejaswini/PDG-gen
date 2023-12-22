import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] d = new int[n];
		for (int i = 0; i < n; i++)
			d[i] = in.nextInt();
		System.out.println(solve(n, d));
		in.close();
	}

	private static long solve(int n, int[] d) {
		if (d[0] != 0)
			return 0;
		Arrays.sort(d);
		if (d[1] != 1)
			return 0;
		int[] c = new int[n + 1];
		for (int i = 1; i < n; i++) {
			if (d[i] - d[i - 1] <= 1)
				c[d[i]]++;
			else
				return 0;
		}
		long r = 1;
		for (int i = 2; c[i] > 0; i++) {
			r *= pow(c[i - 1], c[i]);
			r %= 998244353;
		}
		return r;
	}

	private static long pow(int x, int e) {
		long r = 1;
		for (int i = 0; i < e; i++) {
			r *= x;
			r %= 998244353;
		}
		return r;
	}
}