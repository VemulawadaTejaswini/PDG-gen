import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		sc.close();

		if (k <= 10_000_000_000_000_000L) {
			System.out.println(2);
			if (k % 3 == 0) {
				System.out.println(k + 1 + " 1");
			} else if (k % 3 == 1) {
				System.out.println(k + 2 + " 0");
			} else {
				System.out.println(k + " 2");
			}
		} else {
			System.out.println(50);
			long[] a = new long[50];
			Arrays.fill(a, k / 50);
			for (int i = 0; i < a.length; i++) {
				a[i] += i;
			}
			long b = k % 50;
			for (int i = 0; i < b; i++) {
				a[50 - i]++;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < a.length; i++) {
				sb.append(a[i]).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
