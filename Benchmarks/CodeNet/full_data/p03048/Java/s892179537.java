import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int R,G,B,N;
		R = nextInt();
		G = nextInt();
		B = nextInt();
		N = nextInt();

		long cnt=0;
		for(int i=0;i<=N;i+=R) {
			for(int j=0;j<=N-i;j+=G) {
				for(int k=0;k<=N-i-j;k+=B) {
					if(i+j+k==N)cnt++;
				}
			}
		}
		out.println(cnt);
	}
	@SuppressWarnings("unused")
	private int min(int a, int b) {
		return Math.min(a, b);
	}
	@SuppressWarnings("unused")
	private int nextInt() {
		return Integer.parseInt(next());
	}
	@SuppressWarnings("unused")
	private long nextLong() {
		return Long.parseLong(next());
	}
	private String next() {
		return sc.next();
	}
}
