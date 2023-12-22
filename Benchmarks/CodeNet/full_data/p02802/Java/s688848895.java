import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[M];
		String[] S = new String[M];

		for (int i = 0; i < M; i++) {
			p[i] = sc.nextInt() - 1;
			S[i] = sc.next();
		}
		sc.close();

		boolean[] ac = new boolean[N];
		Arrays.fill(ac, false);

		int numOfAC = 0;
		int numOfWA = 0;

		for (int i = 0; i < M; i++) {
			if (S[i].equals("AC")) {
				if (!ac[p[i]]) {
					numOfAC++;
					ac[p[i]] = true;
				}
			} else { // WA
				if (!ac[p[i]]) {
					numOfWA++;
				}
			}
		}

		out.println(numOfAC + " " + numOfWA);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
