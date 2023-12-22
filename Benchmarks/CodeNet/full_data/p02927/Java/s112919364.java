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
		int M = nextInt();
		int D = nextInt();

		int cnt = 0;
		for(int i=1;i<=M;i++) {// i = 月
			for(int j=22;j<=D;j++) {// j = 日
				int m = j/10;
				int d = j%10;
				if(m*d==i&&j%10>1) {
					cnt++;
				}
			}
		}

		out.println(cnt);
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