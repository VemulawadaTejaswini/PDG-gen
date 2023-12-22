
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] t = new long[n];
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			a[i] = sc.nextInt();

		}

		for (int i = 1; i < n; i++) {
			if (t[i] < t[i - 1] || a[i] < a[i - 1]) {
				long mul = Math.max((long) Math.ceil((double) t[i] / t[i - 1]),
						(long) Math.ceil((double) a[i] / a[i - 1]));
				t[i] *= mul;
				a[i] *= mul;
			}

			//		System.out.print(t_hyou + ", ");
			//		System.out.print(a_hyou + ", ");
			//		System.out.println(t_hyou + a_hyou);

		}
		System.out.println(t[n - 1] + a[n - 1]);
		sc.close();
	}
}