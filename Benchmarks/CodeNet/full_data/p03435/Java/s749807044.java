import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		sc.close();

		int[] a = new int[3];
		int[] b = new int[3];

		String ans = "No";
		LOOP: for (a[0] = 0; a[0] <= 100; a[0]++) {
			b[0] = c[0][0] - a[0];
			b[1] = c[0][1] - a[0];
			b[2] = c[0][2] - a[0];
			if (b[0] < 0 || b[1] < 0 || b[2] < 0) {
				break;
			}

			a[1] = c[1][0] - b[0];
			a[2] = c[2][0] - b[0];

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i] + b[j] != c[i][j]) {
						continue LOOP;
					}
				}
			}
			ans = "Yes";
			break;
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
