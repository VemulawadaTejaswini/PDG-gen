import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		if (Math.min(n, m) == 1) {
			if (Math.max(n, m) == 1) {
				System.out.println(1);
			} else {
				System.out.println(Math.max(n, m) - 2);
			}
		} else {
			long ans = (long) (n - 2) * (long) (m - 2);
			System.out.println(ans);
		}
		sc.close();
	}
}