import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
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
		int N = nextInt();
		String S = next();
		char[] C = S.toCharArray();

		List<List<Integer>> alphabet = new ArrayList<List<Integer>>(26);
		for(int i=0;i<26;i++) {
			alphabet.add(new ArrayList<Integer>());
		}
		for(int i=0;i<N;i++) {
			int t = (int)C[i]-97;
			alphabet.get(t).add(i);
		}


		int max = 0;
		for(int l=0;l<N&&N/2>max;l++) {
			int t = (int)C[l]-97;
			alphabet.get(t).remove(0);
			if(alphabet.get(t).isEmpty()) continue; // 比較対象文字列が存在しない
			int alphalen = alphabet.get(t).size();
			for(int i=0;i<alphalen;i++) {
				int tS_i = alphabet.get(t).get(i); // 比較対象文字列の開始位置
				int cnt = 1;

				for(int j=1;tS_i+j<N&&l+cnt<tS_i;j++) {

					if(C[l+j]==C[tS_i+j]) {
						cnt++;
					}else {
						break;
					}
				}
				if(max < cnt)max = cnt;
			}
		}
		out.println(max);


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