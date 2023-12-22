import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		String str = scan.next();
		int ans = Integer.MAX_VALUE;
		if (str.length() <= 2) {
			if (str.charAt(0) == 'W' && str.charAt(1) == 'E') {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			return;
		}
		for (int i = 1; i < len - 1; i++) {
			int temp = check(str.substring(0, i), str.substring(i + 1, len));
			if (temp < ans) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}

	public static int check(String tag1, String tag2) {
		int ans = 0;
		for (int i = 0; i < tag1.length(); i++) {
			if (tag1.charAt(i) == 'W') {
				ans++;
			}
		}
		for (int i = 0; i < tag2.length(); i++) {
			if (tag2.charAt(i) == 'E') {
				ans++;
			}
		}
		return ans;
	}
}