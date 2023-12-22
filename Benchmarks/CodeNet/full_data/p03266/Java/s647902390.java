import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			if ((i % k != 0) && ((i * 2) % k == 0)) {
				  ans += 3 * ((i + n)/k - (i/k) - 1) + 1;
			}
		}
		
		ans += Math.pow(n / k, 3);

		System.out.println(ans);

		sc.close();
	}
}
