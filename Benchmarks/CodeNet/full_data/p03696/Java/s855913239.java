

import java.util.Scanner;

public class Maiin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int left = 0;

		StringBuilder l = new StringBuilder("");
		StringBuilder r = new StringBuilder("");

		for (int i = 0; i < n; i++) {
			String ss = s.substring(i, i + 1);

			if (ss.equals("(")) {
				left++;
			} else {
				if (left == 0) {
					l.append("(");
				} else {
					left--;
				}

			}
		}

		for (int i = 0; i < left; i++) {
			r.append(")");
		}

		System.out.println(l.toString() + s + r.toString());

	}

}
