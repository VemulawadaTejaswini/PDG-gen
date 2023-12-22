import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		char c[] = S.toCharArray();
		int ans = 0;
		for (int i = 0; i < S.length(); i++) {
			if (c[i] == '+') {
				ans++;
			} else {
				ans--;
			}
		}
		System.out.println(ans);
	}
}
