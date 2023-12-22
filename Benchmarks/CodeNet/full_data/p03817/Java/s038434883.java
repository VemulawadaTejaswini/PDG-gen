import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long x = sc.nextLong();

		sc.close();

		long ans = (x / 11) * 2;
		if (x % 11 == 0) {

		} else if (x % 11 <= 5) {
			ans++;
		} else {
			ans += 2;
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
