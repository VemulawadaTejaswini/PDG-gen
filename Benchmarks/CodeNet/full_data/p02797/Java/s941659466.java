import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		sc.close();

		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		if (k == n) {
			for (int i = 0; i < n; i++) {
				sb.append(s).append(' ');
			}
		} else if (k == 0) {
			int a = 1000000000;
			if (s == 1000000000) {
				a = 1;
			}
			for (int i = 0; i < n; i++) {
				sb.append(a).append(' ');
			}
		} else {
			if (s == 1) {
				for (int i = 0; i < k; i++) {
					sb.append(1).append(' ');
				}
				for (int i = k; i < n; i++) {
					sb.append(2).append(' ');
				}
			} else {
				int a1 = s - 1;
				int a2 = 1;
				for (int i = 0; i <= k; i++) {
					if (i % 2 == 0) {
						sb.append(a1).append(' ');
					} else {
						sb.append(a2).append(' ');
					}
				}
				int a = 1000000000;
				if (s == 1000000000) {
					a = 1;
				}
				for (int i = k + 1; i < n; i++) {
					sb.append(a).append(' ');
				}
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		pw.flush();
	}
}
