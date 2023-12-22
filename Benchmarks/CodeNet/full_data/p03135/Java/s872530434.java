import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int T = sc.nextInt();
		int X = sc.nextInt();
		
		out.println((double)T/X);
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
