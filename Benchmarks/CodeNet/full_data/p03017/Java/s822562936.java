import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;
		int d = sc.nextInt() - 1;
		char[] s = sc.next().toCharArray();
		for (int i = a; i < s.length - 1; i++) {
			if (s[i] == '#' && s[i + 1] == '#') {
				System.out.println("No");
				break;
			}
		}
		if (c < d) {
			System.out.println("Yes");
		} else {
			boolean t = true;
			for (int i = b; i < d && i < s.length - 2; i++) {
				if (s[i] == '.' && s[i + 1] == '.' && s[i + 2] == '.') {
					System.out.println("Yes");
					t = false;
					break;
				}
			}
			if (t) {
				System.out.println("No");
			}
		}
	}
}