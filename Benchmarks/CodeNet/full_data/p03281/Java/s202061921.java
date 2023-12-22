import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int f(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				result++;
			}
		}
		return result;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int ans = 0;
		for (int i = 1; i <= N; i += 2) {
			if (f(i) == 8) {
				ans++;
			}
		}
		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
