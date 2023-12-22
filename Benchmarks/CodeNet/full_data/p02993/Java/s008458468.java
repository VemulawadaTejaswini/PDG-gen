

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] c = s.toCharArray();
		String ans = "Good";

		for (int i = 0; i < 3; i++) {
			if (c[i] == c[i + 1])
				ans = "Bad";
		}
		System.out.println(ans);

	}

}
