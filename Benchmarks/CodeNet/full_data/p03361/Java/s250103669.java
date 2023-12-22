import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int W = sc.nextInt();

		int[][] s = new int[H + 2][W + 2];

		for (int i = 0; i < H; i++) {
			String l = sc.next();
			for (int j = 0; j < W; j++) {
				s[i + 1][j + 1] = l.charAt(j) == '#' ? 1 : 0;
			}
		}
		sc.close();

		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if (s[i][j] == 1 && s[i - 1][j] == 0 && s[i + 1][j] == 0 && s[i][j - 1] == 0 && s[i][j + 1] == 0) {
					out.println("No");
					return;
				}
			}
		}
		out.println("Yes");

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
