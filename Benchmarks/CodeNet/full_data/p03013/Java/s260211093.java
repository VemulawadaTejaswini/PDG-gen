import java.util.Scanner;

public class Main {
	public static int n = 0;
	public static int cnt = 0;
	public static boolean[] steps = null;
	public static int[] cache = null;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		n = scn.nextInt();
		int m = scn.nextInt();
		steps = new boolean[n];
		cache = new int[n];

		for (int i = 0; i < m; i++) {
			steps[scn.nextInt()] = true;
		}

		scn.close();

		System.out.println(calc(0));

	}

	public static int calc(int a) {
		if (a == n) {
			return 1;
		}
		if (a > n) {
			return 0;
		}
		if (steps[a]) {
			return 0;
		}

		if (cache[a] > 0) {
			return cache[a];
		}

		return cache[a] = (calc(a + 1) + calc(a + 2)) % 1000000007;
	}
}