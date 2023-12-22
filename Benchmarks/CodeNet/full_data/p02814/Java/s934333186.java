import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n];

		long mcd = 1;
		boolean isAllZero = true;
		boolean hasZero = false;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong() / 2L;
		}

		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				if (mcd % a[i] != 0) mcd *= a[i];
				isAllZero = false;
			} else {
				hasZero = true;
			}
		}

		if (isAllZero) {
			System.out.println(1);
			return;
		}

		if (hasZero) {
			System.out.println(0);
			return;
		}

		long answer = m / mcd;
		answer -= (m / (mcd * 2));
		System.out.println(answer);
	}
}
