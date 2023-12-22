import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] w = new int[n + 1];
		int[] e = new int[n + 1];
		e[0] = 0;
		for (int i = 1; i <= n; i++) {
			if (s[i-1] == 'E') {
				e[i] = e[i - 1] + 1;
			} else {
				e[i] = e[i - 1];
			}
		}
		w[n] = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (s[i] == 'W') {
				w[i] = w[i + 1] + 1;
			} else {
				w[i] = w[i + 1];
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n + 1; i++) {
			max = Math.max(max, w[i] + e[i]);
		}
		System.out.println(n - max);
	}
}