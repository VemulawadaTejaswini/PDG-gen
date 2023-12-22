import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long[] s1 = new long[n];
		long[] s2 = new long[n];
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		s1[0] = a[0];
		int count = 0;
		// - + - + となる場合
		while (s1[0] >= 0) {
			s1[0]--;
			count++; sum1++;
		}
		for (int i = 1; i < n; i++) {
			count = 0;
			s1[i] = s1[i-1] + a[i];
			// iが奇数の場合は正にする
			if (i % 2 != 0) {
				while (s1[i-1]*s1[i] >= 0) {
					s1[i]++;
					count++; sum1++;
				}
			}
			// iが偶数の場合は負にする
			else {
				while (s1[i-1]*s1[i] >= 0) {
					s1[i]--;
					count++; sum1++;
				}
			}
		}

		s2[0] = a[0];
		count = 0;
		// + - + - となる場合
		while (s2[0] <= 0) {
			s2[0]++;
			count++; sum2++;
		}
		for (int i = 1; i < n; i++) {
			count = 0;
			s2[i] = s2[i-1] + a[i];
			if (i % 2 != 0) {
				while (s2[i-1]*s2[i] >= 0) {
					s2[i]--;
					count++; sum2++;
				}
			}
			else {
				while (s2[i-1]*s2[i] >= 0) {
					s2[i]++;
					count++; sum2++;
				}
			}
		}

		System.out.println(Math.min(sum1, sum2));
	}

}