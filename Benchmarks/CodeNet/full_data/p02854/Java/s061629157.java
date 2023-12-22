import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long tot = 0;
		for (int i = 0; i < n; i++) {
			tot += a[i];
		}
		long ans = 0;
		long half = tot / 2;

		long left = 0;
		long right = 0;
		for (int i = 0; i < n; i++) {
			//			System.out.println(left + " " + half);
			if (left == half) {
				System.out.println(0);
				System.exit(0);
			}
			if (left + a[i] <= half) {
				left += a[i];
			} else {
				right = left + a[i];
				break;
			}
		}

		System.out.println(Math.min(Math.abs(half - left), Math.abs(half - right)));

	}
}