import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String s = sc.next();

		sc.close();

		int hiraki = 0;
		int hiraki2 = 0;
		int toji = 0;
		int toji2 = 0;

		// 左からみていってたりない ) を数える
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == '(') {
				hiraki++;
			} else {
				if (hiraki == 0) {
					hiraki2++;
				} else {
					hiraki--;
				}
			}
		}
		// 右からみていってたりない ) を数える
		for (int i = N - 1; i >= 0; i--) {
			if (s.charAt(i) == ')') {
				toji++;
			} else {
				if (toji == 0) {
					toji2++;
				} else {
					toji--;
				}
			}
		}

		for (int i = 0; i < hiraki2; i++) {
			out.print("(");
		}
		out.print(s);
		for (int i = 0; i < toji2; i++) {
			out.print(")");
		}
		out.println();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
