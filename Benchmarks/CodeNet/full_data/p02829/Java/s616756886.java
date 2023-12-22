import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		if (A > B) {
			int tmp = A;
			A = B;
			B = tmp;
		}

		int ans;
		if (A == 1) {
			if (B == 2) {
				ans = 3;
			} else {
				ans = 2;
			}
		} else {
			ans = 1;
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
