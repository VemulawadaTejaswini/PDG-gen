import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int[] cnt = new int[2];
		for (int i = 0; i < n; i++) {
			cnt[i % 2]++;
		}

		if (cnt[0] == n) {
			if (p == 0) {
				System.out.println((long) Math.pow(2, n));
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println((long) Math.pow(2, n - 1));
		}
	}
}
