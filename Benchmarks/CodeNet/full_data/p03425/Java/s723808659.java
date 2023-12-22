import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] march = new int[5];
		String s;
		for(int i = 0; i < n; i++) {
			s = sc.next();
			if(s.charAt(0) == 'M') march[0]++;
			if(s.charAt(0) == 'A') march[1]++;
			if(s.charAt(0) == 'R') march[2]++;
			if(s.charAt(0) == 'C') march[3]++;
			if(s.charAt(0) == 'H') march[4]++;
		}
		int[][] num = {{0,1,2},{0,1,3},{0,1,4},{0,2,3},{0,2,4},{0,3,4},{1,2,3},{1,3,4},{1,2,4},{2,3,4}};
		long ans = 0;
		for(int i = 0; i < 10; i++) {
			ans += march[num[i][0]]*march[num[i][1]]*march[num[i][2]];
		}
		System.out.println(ans);
		
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