import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int ans = 0;
		for (int i = 1; i < s.length; i++) {
			if (s[i - 1] != s[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
