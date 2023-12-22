import java.util.Scanner;

public class Main {
	private static long[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		a = new long[n + 1];
		long answer = 0;
		for (int i = 2; i <= n; i++) {
			int t = i;
			for (int j = 2; j <= t; j++) {
				while (t % j == 0) {
					a[j]++;
					t /= j;
				}
			}
		}
		answer += count(74);
		answer += count(24) * (count(2) - 1);
		answer += count(14) * (count(4) - 1);
		answer += count(4) * (count(4) - 1) * (count(2) - 2) / 2;

		System.out.println(answer);
	}

	private static long count(int n) {
		long answer = 0;
		for (int i = 2; i < a.length; i++) {
			if (a[i] >= n) answer++;
		}

		return answer;
	}
}
