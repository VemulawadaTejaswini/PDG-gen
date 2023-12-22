import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a  = new int[N+1];

		for(int i=0;i<M;i++) {
			a[sc.nextInt()] ++;
			a[sc.nextInt()] ++;
		}

		for(int i=1;i<=N;i++) {
			out.println(a[i]);
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
