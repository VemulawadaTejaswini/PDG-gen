import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int ans = 0;
		
		if (n < 107 && n >= 105) {
			ans = 1;
		} else if (n >= 107) {
			for (int i = 107; i <= n; i += 2) {
				int div = 1;
				int sum = 0;
				while (div <= i) {
					if (i % div == 0) {
						sum++;
					}
					div++;
				}
				if (sum == 8) {
					ans++;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
