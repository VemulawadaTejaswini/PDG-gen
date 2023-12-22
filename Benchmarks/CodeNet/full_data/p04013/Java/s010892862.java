import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		int end = (int) Math.pow(2, n);
		for (int i = 0; i < end; i++) {
			int sum = 0;
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if ((i >> j) % 2 == 1) {
					sum += x[j];
					cnt++;
				}
			}
			if (sum == a * cnt) {
				ans++;
			}
		}
		System.out.println(ans - 1);
	}
}
