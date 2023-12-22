import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] s = sc.next().toCharArray();
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '2') {
				ans++;
			}
		}
		System.out.println(ans);
	}
}