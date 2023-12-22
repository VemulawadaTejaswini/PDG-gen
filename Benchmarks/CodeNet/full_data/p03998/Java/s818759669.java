import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String[] X = new String[3];
		X[0] = sc.next();
		X[1] = sc.next();
		X[2] = sc.next();

		sc.close();

		int turn = 0;
		int[] idx = new int[3];

		char ans;
		while (true) {
			if (idx[turn] >= X[turn].length()) {
				ans = (char) ('A' + turn);
				break;
			}

			char c = X[turn].charAt(idx[turn]++);
			turn = (char) (c - 'a');
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
