import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {
				System.out.println("No");
				return;
			}
		}
		int n2 = n / 2;
		for (int i = 0; i < n2; i++) {
			if (s.charAt(i) != s.charAt(n2 - 1 - i)) {
				System.out.println("No");
				return;
			}
		}
		for (int i = 0; i < n2; i++) {
			if (s.charAt(i + n2 + 1) != s.charAt(n - 1 - i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
