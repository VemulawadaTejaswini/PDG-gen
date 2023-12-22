import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		out.println(((N / 111) + (Math.min(N % 111, 1))) * 111);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
