import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		String s = Long.toString(N);
		int l = s.length();
//		int[][] dp = new int[l + 1][2];
//		dp[1][0] = s.charAt(0) - '0';
//		dp[1][1] = s.charAt(0) - '0' - 1;
//		for(int i = 0; i < l; i++) {
//			if(s.charAt(i) == '1') {
//
//			}
//		}
		int cnt = 0;
		for(int i = 0; i < l; i++) {
			if(s.charAt(i) == '9') {
				cnt++;
			}
		}
		if(cnt == l) {
			System.out.println(l * 9);
		}else {
			if(s.charAt(0) == '1') {
				System.out.println(l * 9 - 9);
			}else {
				int ans = l * 9 - 9;
				ans += s.charAt(0) - '0' - 1;
				System.out.println(ans);
			}
		}

	}
}