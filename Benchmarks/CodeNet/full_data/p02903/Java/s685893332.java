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
		int H = nextInt();
		int W = nextInt();
		int A = W - nextInt();
		int B = H - nextInt();

		int[][] map = new int[H][W];
		int[] h = new int[H];
		int[] w = new int[W];

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(h[i]<A&&w[j]<B) {
					map[i][j] = 1;
					h[i]++;
					w[j]++;
				}
			}
		}

		int cntA = 0,cntB = 0;
		for(int i=0;i<H;i++) {
			if(h[i] == A)cntA++;
		}
		for(int j=0;j<W;j++) {
			if(w[j] == B)cntB++;
		}
		if(cntA != B||cntB != A) {
			out.println("No");
			return;
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				out.print(map[i][j]);
			}
			out.println();
		}

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