import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n, k;
		n = in.nextInt();
		k = in.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = in.nextInt();
		solve(n, k, p);
		in.close();
	}

	private static void solve(int n, int k, int[] p) {
		boolean[] d = new boolean[n];
		for (int i = 1; i < n; i++)
			if (p[i] < p[i - 1])
				d[i] = true;

		int s = 0;
		for (int i = 1; i < k; i++)
			if (d[i])
				s++;

		int r = 1;
		boolean seq = false;
		if (s == 0)
			seq = true;
		for (int i = 1, j = k; j < n; i++, j++) {
			if (d[i] || d[j]) {
				r++;
				if (d[i])
					s--;
				if (d[j])
					s++;
				if (s == 0)
					if (seq)
						r--;
					else
						seq = true;
			}
		}
		System.out.println(r);
	}
}