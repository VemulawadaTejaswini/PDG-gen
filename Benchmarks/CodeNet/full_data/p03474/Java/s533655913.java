import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		char[] cs = s.toCharArray();
		int cnt = 0;

		if (String.valueOf(cs[a]).equals("-")) {
			for (int i = 0; i < a; i++) {
				if (Character.isDigit(cs[i])) {
					cnt++;
				}
			}
			for (int i = (a + 1); i <= (a + b); i++) {
				if (Character.isDigit(cs[i])) {
					cnt++;
				}
			}
			if (cnt == (a + b)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}