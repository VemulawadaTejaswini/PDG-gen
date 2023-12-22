import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] gcd_front = new int[N];
			int[] gcd_back = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				if (i == 0) gcd_front[i] = a[i];
				else gcd_front[i] = gcd(gcd_front[i - 1], a[i]);
			}
			gcd_back[N - 1] = a[N - 1];
			for (int i = N - 2; i >= 0; i--) {
				gcd_back[i] = gcd(gcd_back[i + 1], a[i]);
			}
			int max_gcd = 0;
			for (int i = 0; i < N; i++) {
				if (i == 0) max_gcd = Math.max(max_gcd, gcd_back[i + 1]);
				else if (i == N - 1) max_gcd = Math.max(max_gcd, gcd_front[i - 1]);
				else max_gcd = Math.max(max_gcd, gcd(gcd_front[i - 1], gcd_back[i + 1]));
			}
			System.out.println(max_gcd);
		}
	}

	static int gcd(int x, int y) {
		if (y == 0) return x;
		return gcd(y, x % y);
	}
}