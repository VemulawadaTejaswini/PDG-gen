import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		
		out.println(Math.min(Math.min(P+Q, Q+R), R+P));
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
