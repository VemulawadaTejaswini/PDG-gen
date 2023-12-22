import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] n = new int[N + 1];
		String ans = "No";
		int c4 = 0, c2 = 0;

		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
			if (n[i] % 4 == 0) {
				c4++;
			} else if (n[i] % 2 == 0) {
				c2++;
			}
		}

		if (c2 == N) {
			ans = "Yes";
		} else {
			if (c2 >= 2) {
				N -= c2;
				if ((N % 2) == 0 && (N / 2) <= c4) {
					ans = "Yes";
				} else if ((N % 2) != 0 && (c4 * 2) >= (N + 1)) {
					ans = "Yes";
				}
			} else {
				if ((N % 2) == 0 && (N / 2) <= c4) {
					ans = "Yes";
				} else if ((N % 2) != 0 && (c4 * 2) >= (N - 1)) {
					ans = "Yes";
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}