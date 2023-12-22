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
		
		int l = 1;
		int r = N;
		
		for(int i=0;i<M;i++) {
			l = Math.max(l,  sc.nextInt());
			r = Math.min(r, sc.nextInt());
		}
		
		out.println(r-l+1);
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
