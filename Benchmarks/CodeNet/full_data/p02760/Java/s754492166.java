import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[][] A = new int[4][4];
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();

		for (int k = 0; k < N; k++) {
			int b = sc.nextInt();

			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					if (A[i][j] == b) {
						A[i][j] = -1;
					}
				}
			}
		}

		sc.close();

		String ans = "No";

		for (int i = 1; i <= 3; i++) {
			boolean z = true;
			for (int j = 1; j <= 3; j++) {
				if (A[i][j] != -1) {
					z = false;
				}
			}

			if (z) {
				ans = "Yes";
				break;
			}
			z = true;
			for (int j = 1; j <= 3; j++) {
				if (A[j][i] != -1) {
					z = false;
				}
			}
			if (z) {
				ans = "Yes";
				break;
			}
		}

		if (A[1][1] == -1 && A[2][2] == -1 && A[3][3] == -1) {
			ans = "Yes";
		}

		if (A[3][1] == -1 && A[2][2] == -1 && A[1][3] == -1) {
			ans = "Yes";
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
