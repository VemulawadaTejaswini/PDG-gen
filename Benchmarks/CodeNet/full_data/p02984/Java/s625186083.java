import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] aa = new long[n];
		long a = 0;
		for (int i = 0; i < n; i++) {
			a = sc.nextLong();
			for (int j = 0; j < n; j++) {
				if (i < j) {
					if (0 == i % 2) {
						if (0 == j % 2) {
							aa[j] -= a;
						} else {
							aa[j] += a;
						}
					} else {
						if (0 == j % 2) {
							aa[j] += a;
						} else {
							aa[j] -= a;
						}
					}
				} else {
					if (0 == i % 2) {
						if (0 == j % 2) {
							aa[j] += a;
						} else {
							aa[j] -= a;
						}
					} else {
						if (0 == j % 2) {
							aa[j] -= a;
						} else {
							aa[j] += a;
						}
					}
				}
			}
		}

		System.out.print(aa[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + aa[i]);
		}
	}
}
