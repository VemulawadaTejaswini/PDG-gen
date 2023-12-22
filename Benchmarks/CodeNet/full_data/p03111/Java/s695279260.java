import java.util.Scanner;

public class Main {
	private static int[] l;
	private static int A, B, C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		System.out.println(solve(0, 0, 0, 0));
	}

	private static long solve(int p, int a, int b, int c) {
		if (p == l.length) {
			if (a == 0 || b == 0 || c == 0) return 1000000000000L;
			return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
		}

		long answer = solve(p + 1, a, b, c);
		answer = Math.min(answer, solve(p + 1, a + l[p], b, c) + 10);
		answer = Math.min(answer, solve(p + 1, a, b + l[p], c) + 10);
		answer = Math.min(answer, solve(p + 1, a, b, c + l[p]) + 10);

		return answer;
	}
}
