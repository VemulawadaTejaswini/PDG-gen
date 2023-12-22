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
		int X = sc.nextInt();
		
		int[] P = new int[N+1];
		for(int i=0;i<M;i++) {
			int j = sc.nextInt();
			P[j] = 1;
		}
		sc.close();
		
		//左
		int ansL = 0;
		for(int i=X;i>=0;i--) {
			ansL += P[i];
		}
		
		//右
		int ansR = 0;
		for(int i=X;i<N;i++) {
			ansR += P[i];
		}
		
		out.println(Math.min(ansL, ansR));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
