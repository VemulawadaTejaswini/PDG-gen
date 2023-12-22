

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int Q = scan.nextInt();

		//true そのまま false 反転
		boolean flg = true;

		for (int i = 0; i < Q; i++) {

			if (scan.nextInt() == 1) {
				flg = !flg;
			} else {
				if (scan.nextInt() == 1) {
					if (flg)
						S = scan.next() + S;
					else
						S = S + scan.next();
				} else {
					if (flg)
						S = S + scan.next();
					else
						S = scan.next() + S;
				}
			}

		}

		if (!flg) {
			StringBuffer strb = new StringBuffer(S);
			S = strb.reverse().toString();
		}
		System.out.println(S);
	}

}
