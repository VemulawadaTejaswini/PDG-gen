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
		String S1 = next();
		String S2 = next();
		int N = S2.length();
		int SearchTlen = S1.length();
		char[] SearchT = (S1+S1).toCharArray();//search対象の配列
		char[] SearchC = S2.toCharArray();//searchする文字

		long cnt = 1;
		int index = 0;
		int Previous_index = 0;// 前のindex
		for(int l=0;l<N;l++) {
			while(index<SearchTlen*2) {
				if(SearchC[l]==SearchT[index]) {
					break;
				}
				index++;
			}
			if(index>=SearchTlen*2) {
				out.println(-1);
				return;
			}
			cnt += index - Previous_index;
			if(index >= SearchTlen) {
				index -= SearchTlen;
			}
			Previous_index = index;
			index++;
		}
		out.println(cnt);
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