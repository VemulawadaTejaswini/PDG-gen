import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int r = nextInt();
		int D = nextInt();
		int tX = nextInt();//x2000

		int[]x = new int[11];
		x[0]=tX;
		for(int i=0;i<10;i++)x[i+1]=x[i]*r-D;
		for(int i=1;i<=10;i++)out.println(x[i]);
	}

	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}