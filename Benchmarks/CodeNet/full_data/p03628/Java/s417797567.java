import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] s = new char[2][n];
		s[0] = sc.next().toCharArray();
		s[1] = sc.next().toCharArray();
		sc.close();

		int m = 1000000007;
		long ans = 3;
		boolean tate = true;
		int i = 1;
		if (s[0][0] != s[1][0]) {
			ans = 6;
			tate = false;
			i = 2;
		}
		for ( ; i < n; i++) {
			if (tate) {
				ans *= 2;
				ans %= m;
				if (s[0][i] != s[1][i]) {
					tate = false;
					i++;
				}
			} else {
				if (s[0][i] == s[1][i]) {
					tate = true;
				} else {
					ans *= 3;
					ans %= m;
					i++;
				}
			}
		}
		System.out.println(ans);
	}
}
