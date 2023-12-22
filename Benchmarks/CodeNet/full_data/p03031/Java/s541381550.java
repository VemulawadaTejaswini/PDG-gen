import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] t = new int[m][10];
		for (int i = 0; i < m; i++) {
			int k = in.nextInt();
			for (int j = 0; j < k; j++)
				t[i][j] = in.nextInt();
		}
		int[] s = new int[m];
		for (int i = 0; i < m; i++)
			s[i] = in.nextInt();
		System.out.println(solve(n, m, t, s));
		in.close();
	}

	private static int solve(int n, int m, int[][] t, int[] s) {
		int r = 0;
		for (int i = 0; i < Math.pow(2, n); i++)
			if (SolveTest(n, m, t, s, i))
				r++;
		return r;
	}

	private static boolean SolveTest(int n, int m, int[][] t, int[] s, int c) {
		for (int i = 0; i < m; i++) {
			int x = 0;
			for (int j = 0; j < n; j++) {
				if (t[i][j] == 0)
					break;
				x += (c >> (t[i][j] - 1)) % 2;
			}
			if (x % 2 != s[i])
				return false;
		}
		return true;
	}

}