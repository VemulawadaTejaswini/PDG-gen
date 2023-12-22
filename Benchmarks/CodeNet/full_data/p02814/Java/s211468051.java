import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n];

		long mcd = 1;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong() / 2;
			if (mcd % a[i] != 0) {
				mcd *= a[i];
			}
		}

		System.out.println(m / mcd - m / (mcd * 2));
	}
}
