import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt(); // N人
		int K = nextInt(); // Kcm
		int[] h = nextIntArray(N);

		int sum = 0;
		for(int a: h) {
			if(a>=K)sum++;
		}
		out.println(sum);
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}