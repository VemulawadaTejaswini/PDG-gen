import java.util.Scanner;

public class Main {
	static long ans = 0;
	static int[] x;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N, A;
		N = scanner.nextInt();
		A = scanner.nextInt();
		x = new int[N];
		for (int i = 0; i < x.length; i++) {
			x[i] = scanner.nextInt() - A;
		}

		solve(0, 0);

		System.out.println(ans);
	}

	static void solve(int now, int d) {
		if (d == x.length)
			return;
		solve(now, d + 1);
		now = now + x[d];
		if (now == 0)
			ans++;
		solve(now, d + 1);
	}
}