import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		int len = s.length();

		char[] ans = new char[len];
		for (int i = 0; i < len - 1; i++) {
			if ('z' - s.charAt(i) + 1 <= K) {
				K = K - ('z' - s.charAt(i) + 1);
				ans[i] = 'a';
			} else {
				ans[i] = s.charAt(i);
			}
		}
		ans[len - 1] = (char) (s.charAt(len - 1) + (K % 26));
		if (ans[len - 1] > 'z') {
			ans[len - 1] = (char) (ans[len - 1] - 26);
		}
		System.out.println(new String(ans));
	}
}
