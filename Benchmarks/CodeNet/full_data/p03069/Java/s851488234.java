package abc.tenka1.c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		// N == S.length();
		boolean flag = false;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '#') {
				flag = true;
			}
			if (flag == true && S.charAt(i) == '.') {
				ans++;
			}
		}
		flag = false;
		int ans2 = 0;
		for (int i = N - 1; i >= 0; i--) {
			if(S.charAt(i) == '.') {
				flag = true;
			}
			if(flag == true && S.charAt(i) == '#') {
				ans2 ++;
			}
		}
		System.out.println(Math.min(ans, ans2));
		scanner.close();
	}
}
