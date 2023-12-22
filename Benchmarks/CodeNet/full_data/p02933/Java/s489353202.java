import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int a = sc.nextInt();
		String s = sc.next();

		sc.close();

		if (a >= 3200) {
			out.println(s);
		} else {
			out.println("red");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
