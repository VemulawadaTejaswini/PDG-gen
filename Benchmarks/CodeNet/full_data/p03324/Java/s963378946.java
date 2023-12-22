import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int D = sc.nextInt();
		int N = sc.nextInt();

		int x = (int) Math.pow(100, D);

		if(N==100)  N++;
		out.println(x*N);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
