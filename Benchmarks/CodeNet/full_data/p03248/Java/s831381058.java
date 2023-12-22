import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int n = s.length;
		if (s[0] == '0' || s[n - 1] == '1') {
			System.out.println(-1);
			return;
		}
		for (int i = 0; i < n / 2; i++) {
			if (s[i] != s[n - 2 - i]) {
				System.out.println(-1);
				return;
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		
		int idx = 0;
		for (int i = 0; i < n - 1; i++) {
			pw.println((idx + 1) + " " + (i + 2));
			if (s[i] == '1') {
				idx = i + 1;
			}
		}
		pw.flush();
	}
}
