import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
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
		for(List<Integer> tL:alphabet) {
			int tLlen = tL.size();
			for(int tll=0;tll<tLlen-1;tll++) {
				int i = tL.get(tll);
				for(int j=tll+1;j<tLlen;j++) {
					int cnt = 1;
					int tS_i = tL.get(j);
					if(N - tS_i <= max)continue;
					for(int k = 1;tS_i+k<N&&i+k<tS_i;k++) {
						if(C[i+k]==C[tS_i+k]) {
							cnt++;
						}else {
							break;
						}
					}
					if(max < cnt) max = cnt;
				}
			}
		}

		out.println(max);
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