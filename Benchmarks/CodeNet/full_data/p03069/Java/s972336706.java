
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		// N == S.length();
//		boolean flag = false;
//		int ans = 0;
//		for (int i = 0; i < N; i++) {
//			if (S.charAt(i) == '#') {
//				flag = true;
//			}
//			if (flag == true && S.charAt(i) == '.') {
//				ans++;
//			}
//		}
//		flag = false;
//		int ans2 = 0;
//		for (int i = N - 1; i >= 0; i--) {
//			if(S.charAt(i) == '.') {
//				flag = true;
//			}
//			if(flag == true && S.charAt(i) == '#') {
//				ans2 ++;
//			}
//		}
//		System.out.println(Math.min(ans, ans2));
		int[] ans = new int[N];
		int black = 0;
		for (int i = 1; i < N; i++) {
			if(S.charAt(i) == '#') {
				black++;
			}
			if (S.charAt(i - 1) == '.' && S.charAt(i) == '#') {
				ans[i] = black;
				for(int k = i; k < N ; k ++) {
					if(S.charAt(k) == '.') {
						ans[i]++;
					}
				}
			}
		}
		int a = N;
		for(int an: ans) {
			if(an < a && an != 0) {
				a = an;
			}
		}
		if(a == N) {
			System.out.println(0);
		}else {
			System.out.println(a);			
		}
		scanner.close();
	}
}
