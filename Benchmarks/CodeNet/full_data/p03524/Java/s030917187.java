

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int a = 0;
		int b = 0;
		int c = 0;

		for (char ch : s.toCharArray()) {
			if ('a' == ch)
				a++;
			if ('b' == ch)
				b++;
			if ('c' == ch)
				c++;
		}

		int ab = Math.abs(a - b);
		int ac = Math.abs(a - c);
		int bc = Math.abs(b - c);

		String ans = "NO";
		if (ab == 0 || ab == 1) {
			if (ac == 0 || ac == 1) {
				if (bc == 0 || bc == 1) {
					ans = "YES";
				}
			}
		}

		System.out.println(ans);
	}

}
