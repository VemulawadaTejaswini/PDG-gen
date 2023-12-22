import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int r = -100; r <= 100; r++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int d = a[i] - r;
				sum += d * d;
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
