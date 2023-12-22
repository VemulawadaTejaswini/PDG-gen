import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int AB = sc.nextInt();
		int BC = sc.nextInt();
		int CA = sc.nextInt();

		out.println((BC*AB)/2);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
