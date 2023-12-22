import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		int ans = 0;

		for (int i = 0; i < 3; i++) {
			char s = S.charAt(i);
			char t = T.charAt(i);
			if (s == t) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
