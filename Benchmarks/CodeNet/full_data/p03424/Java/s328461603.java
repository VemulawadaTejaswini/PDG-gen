import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.equals("G"))a[0]++;
			if(s.equals("W"))a[1]++;
			if(s.equals("Y"))a[2]++;
			if(s.equals("P"))a[3]++;
		}
		int count = 0;
		for(int i = 0; i < 4; i++) {
			if(a[i] != 0) count++;
		}
		System.out.println(count == 4 ? "Four" : "Three" );
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	long combination(int n, int r, int m) { //nCr mod m
		long[][] Combination = new long[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Combination[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				Combination[i][j] = (Combination[i - 1][j - 1] + Combination[i - 1][j]) % m;
			}
		}
		return Combination[n][r];
	}

	int gcd(int a, int b) {
		if (a < b) {
			int c = a;
			a = b;
			b = c;
		}
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}