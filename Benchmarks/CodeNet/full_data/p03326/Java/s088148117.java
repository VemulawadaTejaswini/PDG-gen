import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		long[][] t = new long[8][n];
		for (int i = 0; i < n; i++) {
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			t[0][i] = x + y + z;
			t[1][i] = -x + y + z;
			t[2][i] = x - y + z;
			t[3][i] = x + y - z;
			t[4][i] = -x - y + z;
			t[5][i] = -x + y - z;
			t[6][i] = x - y - z;
			t[7][i] = -x - y - z;
		}
		Arrays.sort(t[0]);
		Arrays.sort(t[1]);
		Arrays.sort(t[2]);
		Arrays.sort(t[3]);
		Arrays.sort(t[4]);
		Arrays.sort(t[5]);
		Arrays.sort(t[6]);
		Arrays.sort(t[7]);
		long[] st = new long[8];
		for (int i = 0; i < 8; i++)
			for (int j = n - 1; j >= n - m; j--)
				st[i] += t[i][j];
		Arrays.sort(st);
		System.out.println(st[7]);
		in.close();
	}

	private static int solve(int[] a) {
		int r = 0;
		for (int i = 0; i < a.length; i++)
			for (; a[i] % 2 == 0; a[i] /= 2)
				r++;
		return r;
	}
}