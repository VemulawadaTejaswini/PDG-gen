import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
		int one = -1;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '1') {
				one++;
			}
		}

		long ans = 1;
		for (int i = 0; i < n - 1; i++) {
			ans *= 3;
			ans %= 1000000007;
		}

		long ans1 = 2;
		for (int i = 0; i < one; i++) {
			ans1 *= 3;
			ans1 %= 1000000007;
		}
		ans += ans1;
		ans %= 1000000007;
		System.out.println(ans);
	}
}
