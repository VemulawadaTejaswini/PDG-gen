
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int N = S.length();
		int ans = 0;
		char[] S2A = new char[N];
		S2A[0] = S.charAt(0);
		if (N == 1) {
			ans = 0;
		} else {
			for (int i = 1; i < N; i++) {
				S2A[i] = S.charAt(i);
				if(func(S2A[i], S2A[i-1])) {
					ans++;
					if(S2A[i-1] == '0') {
						S2A[i] = '1';
					}else {
						S2A[i] = '0';
					}
				}
			}
		}
		System.out.println(ans);
		scanner.close();
	}

	public static boolean func(char c, char pre) {
		char cs;
		if (pre == '0') {
			cs = '1';
		} else {
			cs = '0';
		}
		if (c != cs) {
			c = cs;
			return true;
		}
		return false;
	}
}
