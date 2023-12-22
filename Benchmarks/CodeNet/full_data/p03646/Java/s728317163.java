import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		int n = (int) Math.min(k, 50);
		n = Math.max(n, 2);

		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + (k / n);
		}

		long m = k % n;
		for (int i = 0; i < m; i++) {
			Arrays.sort(a);
			a[0] += n;
			for (int j = 1; j < n; j++) {
				a[i] -= 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(n).append("\n");
		for (int i = 0; i < n; i++) {
			sb.append(a[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
}
