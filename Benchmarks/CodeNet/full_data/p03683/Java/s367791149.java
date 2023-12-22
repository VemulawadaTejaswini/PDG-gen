import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 1000000007;
		long ans = 1;
		if (Math.abs(n - m) == 1) {
			for (int i = 1; i <= n; i++) {
				ans = ans * i % a;
			}
			for (int i = 1; i <= m; i++) {
				ans = ans * i % a;
			}
			System.out.println(ans);
		} else if (Math.abs(n - m) == 0) {
			for (int i = 1; i <= n; i++) {
				ans = ans * i % a;
			}
			for (int i = 1; i <= m; i++) {
				ans = ans * i % a;
			}
			ans = (ans * 2) % a;
			System.out.println(ans);
		} else {
			System.out.println(0);
		}

	}
}
