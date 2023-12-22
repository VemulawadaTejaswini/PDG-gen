

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();

		StringBuilder ans = new StringBuilder();

		for (char ch : c) {
			if (ch == '0')
				ans.append("0");

			if (ch == '1')
				ans.append("1");

			if (ch == 'B') {
				if (ans.length() == 1)
					ans = new StringBuilder();
				if (!ans.toString().isEmpty())
					ans.setLength(ans.length() - 1);
			}
		}

		System.out.println(ans.toString());

	}

}
