import java.util.Scanner;

public class Main {
	static int ans = 0;
	static long N;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		dfs(0, 0, 0, 0);
		System.out.println(ans);
	}

	private static void dfs(long x, int x3, int x5, int x7) {
		if (x3 > 0 && x5 > 0 && x7 > 0 && x <= N)
			ans++;
		if (x * 10 < N) {
			dfs(x * 10 + 3, x3 + 1, x5, x7);
			dfs(x * 10 + 5, x3, x5 + 1, x7);
			dfs(x * 10 + 7, x3, x5, x7 + 1);
		}
	}
}