import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if (s.length() == 1) {
			System.out.println(s);
			return;
		}

		int cnt = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '9') {
				cnt++;
			}
		}
		int a = Integer.parseInt(s.substring(0, 1));
		if (cnt < s.length() - 1) {
			a--;
		}
		System.out.println(a + 9 * (s.length() - 1));
	}
}
