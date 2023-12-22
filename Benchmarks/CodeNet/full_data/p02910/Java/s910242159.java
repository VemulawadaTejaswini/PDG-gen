package B;

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
		String S = next();
		char[] C = S.toCharArray();

		String res = "Yes";
		for(int i=1;i<=C.length;i++) {
			if(i%2==1&&C[i-1]=='L') {
				res = "No";
				break;
			}else if(i%2==0&&C[i-1]=='R'){
				res = "No";
				break;
			}
		}
		out.println(res);

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