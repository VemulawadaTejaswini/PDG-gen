import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long K = sc.nextLong();

		sc.close();

		long ans = (N + K) % K;

		ans = Math.min(ans, Math.abs(ans - K));

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
