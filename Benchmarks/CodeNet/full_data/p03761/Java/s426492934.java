import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		String[] S = new String[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.next();
		}

		sc.close();

		int[][] c = new int[n][26];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < S[i].length(); j++) {
				int ch = S[i].charAt(j) - 'a';
				c[i][ch]++;
			}
		}

		StringBuffer ans = new StringBuffer();

		for (int x = 0; x <= 'z' - 'a'; x++) {
			int num = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				num = Math.min(num, c[i][x]);
			}

			for (int j = 0; j < num; j++) {
				ans.append((char) (x + 'a'));
			}
		}

		out.println(ans.toString());
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
