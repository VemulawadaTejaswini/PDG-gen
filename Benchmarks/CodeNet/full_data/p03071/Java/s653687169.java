import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		out.println(Math.max(Math.max(A+A-1, A+B), (B+B-1)));

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
