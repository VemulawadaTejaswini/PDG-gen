

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int Q = scan.nextInt();

		StringBuilder sb = new StringBuilder(S);

		//true そのまま false 反転
		boolean flg = true;

		for (int i = 0; i < Q; i++) {

			if (scan.nextInt() == 1) {
				flg = !flg;
			} else {

				if (scan.nextInt() == 1) {
					if (flg)
						sb.insert(0, scan.next());
					else
						sb.append(scan.next());
				} else {
					if (flg)
						sb.append(scan.next());
					else
						sb.insert(0, scan.next());
				}
			}

		}

		S = sb.toString();

		if (!flg) {
			StringBuffer strb = new StringBuffer(S);
			S = strb.reverse().toString();
		}
		System.out.println(S);
	}

}
