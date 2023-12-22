import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int m = sc.nextInt();
		long ans = 0;

		if (n == 2 || m == 2) {
			ans = 0;
		}else if (n == 1 && m == 1) {
			ans = 1;
		} else if (n == 1) {
			ans = m - 1;
		} else if (m == 1) {
			ans = n - 1;
		} else if (n > 2 && m > 2) {
			ans = Math.abs((n - 2) * (m - 2));
		}
		
		System.out.println(ans);

		sc.close();
	}
}
