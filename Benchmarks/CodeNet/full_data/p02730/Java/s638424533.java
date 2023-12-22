import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		String tmp = s.substring(0, (n - 1) / 2);
		String tmp2 = s.substring((n + 1) / 2, n);
		boolean flag = true;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				flag = false;
				break;
			}
		}
		if (!flag) {
			System.out.println("No");
		} else {
			flag = true;
			for (int i = 0; i < tmp.length() / 2; i++) {
				if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println("No");
			} else {
				flag = true;
				for (int i = 0; i < tmp2.length() / 2; i++) {
					if (tmp2.charAt(i) != tmp2.charAt(tmp2.length() - 1 - i)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
