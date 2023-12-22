

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		String S = scan.next();
		int Q = Integer.parseInt(scan.next());
		int[] k = new int[Q];
		for (int i = 0; i < Q; i++) {
			k[i] = Integer.parseInt(scan.next());
		}
		List<DMC> dmc_list = new ArrayList<>();
		for (int a = 0; a < S.length(); a++) {
			if (!(S.charAt(a) == 'D'))
				continue;
			for (int b = a+1; b < S.length(); b++) {
				if (!(S.charAt(b) == 'M'))
					continue;
				for (int c = b+1; c < S.length(); c++) {
					if (!(S.charAt(c) == 'C'))
						continue;
					dmc_list.add(new DMC(a, b, c));
				}
			}
		}
		int[] k_dmc = new int[Q];
		for (int i = 0; i < dmc_list.size(); i++) {
			for (int j = 0; j < Q; j++) {
				if (dmc_list.get(i).c - dmc_list.get(i).a < k[j]) {
					k_dmc[j]++;
				}
			}
		}
		for (int i = 0; i < Q; i++) {
			System.out.println(k_dmc[i]);
		}
	}

	public static class DMC {
		int a;
		int b;
		int c;

		public DMC(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
}
