
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		// N == S.length();
		int[] ans = new int[N];
		for (int i = 1; i < N; i++) {
			if (S.charAt(i - 1) == '.' && S.charAt(i) == '#') {
				for (int j = 0; j < i; j++) {
					if(S.charAt(j) == '#') {
						ans[i]++;
					}
				}
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
