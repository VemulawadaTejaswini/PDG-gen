

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int Q = scan.nextInt();

		for (int i = 0; i < Q; i++) {

			if (scan.nextInt() == 1) {
				StringBuffer strb = new StringBuffer(S);
				S = strb.reverse().toString();
			} else {
				if (scan.nextInt() == 1) {
					StringBuilder sb = new StringBuilder(S);
					S = sb.insert(0, scan.next()).toString();
				} else {
					S = S + scan.next();
				}
			}

		}

		System.out.println(S);
	}

}
