import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();

		int[] leftW = new int[N];
		int[] rightE = new int[N];

		leftW[0] = S.charAt(0) == 'W' ? 1 : 0;
		for (int i = 1; i < N; i++) {
			leftW[i] = leftW[i - 1] + (S.charAt(i) == 'W' ? 1 : 0);
		}

		rightE[N - 1] = S.charAt(N - 1) == 'E' ? 1 : 0;
		for (int i = N - 2; i >= 0; i--) {
			rightE[i] = rightE[i + 1] + (S.charAt(i) == 'E' ? 1 : 0);
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int x;
			if (i == 0) {
				x = rightE[i + 1];
			} else if (i == N - 1) {
				x = leftW[i - 1];
			} else {
				x = leftW[i - 1] + rightE[i + 1];
			}
			ans = Math.min(ans, x);
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
