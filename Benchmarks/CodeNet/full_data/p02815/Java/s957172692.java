import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final int M = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		int[] t = new int[n + 1];
		t[0] = 1;
		for (int i = 1; i <= n; i++) {
			t[i] = t[i - 1] * 2;
			t[i] %= M;
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			int l = i, r = n - 1 - i;
			int a = t[r];
			if (r != 0) a = (a + (t[r - 1] * r)) % M;
			a = a * t[l] % M;
			a = a * c[i] % M;

			answer += a;
			answer %= M;
		}
		answer *= t[n];
		System.out.println(answer % M);
	}
}
