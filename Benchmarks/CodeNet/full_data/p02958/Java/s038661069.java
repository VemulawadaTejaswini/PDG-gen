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
		int N = nextInt();
		int[] A = nextIntArray(N);

		int t1 = -1,t2 = -1;
		for(int i=0;i<N-1;i++) {
			if(A[i] > A[i+1]) {
				t1 = i;
				for(int j=i+1;j<N-1;j++) {
					if(A[j] > A[j+1]) {
						t2 = j+1;
					}
				}
				break;
			}
		}
		if(t1 != -1&&t2 != -1) {
			int tmp = A[t1];
			A[t1] = A[t2];
			A[t2] = tmp;
		}
		for(int i=0;i<N-1;i++) {
			if(A[i]>A[i+1]) {
				out.println("NO");
				return;
			}
		}
		out.println("YES");
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
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