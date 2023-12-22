package compareStr;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		int ans = 0;
		boolean scount = false;
		boolean fcount = false;
		boolean tcount = false;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		for (int i = 357; i < N + 1; i = i + 2) {
			String S = String.valueOf(i);
			int Slen = S.length();
			for (int j = 0; j < Slen; j++) {
				if (S.charAt(j) == '7') {
					scount = true;
				} else if (S.charAt(j) == '5') {
					fcount = true;
				} else if (S.charAt(j) == '3') {
					tcount = true;
				} else {
					flag = false;
					break;
				}
			}
			if (scount && fcount && tcount && flag) {
				ans = ans + 1;
			}
			scount = false;
			fcount = false;
			tcount = false;
			flag = true;
		} out.println(ans);
		out.flush();
	}

}
