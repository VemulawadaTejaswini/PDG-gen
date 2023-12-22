import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			int a = i;
			int b = n - i;
			int sum = 0;
			while (a > 0) {
				sum += a % 10;
				a /= 10;
			}
			while (b > 0) {
				sum += b % 10;
				b /= 10;
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
