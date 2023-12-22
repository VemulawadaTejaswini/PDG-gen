import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long X = sc.nextLong();
		long Y = sc.nextLong();

		sc.close();

		int ans = 0;
		while (X <= Y) {
			ans++;
			X <<= 1;
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
