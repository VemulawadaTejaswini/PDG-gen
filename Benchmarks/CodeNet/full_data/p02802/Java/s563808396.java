
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 問題
		int n = sc.nextInt();
		// 提出
		int m = sc.nextInt();

		if (m == 0) {
			System.out.println(0 + " " + 0);
		} else {
			String[][] a = new String[m][2];
			for (int i = 0; i < a.length; i++) {
				a[i][0] = sc.next();
				a[i][1] = sc.next();
			}
			
			int ac = 0;
			int wa = 0;
			List<String> check = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				if (check.contains(a[i][0])) {
					continue;
				}
				if (a[i][1].equals("AC")) {
					ac++;
					check.add(a[i][0]);
				} else if (a[i][1].equals("WA")) {
					wa++;
				}
			}
			
			System.out.println(ac + " " + wa);

		}

	}
}