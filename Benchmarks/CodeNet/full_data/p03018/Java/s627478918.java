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
		String S = next();
		int indexOf = S.indexOf("A");
		if(indexOf > 0)S = S.substring(indexOf, S.length());
		S += "A";
		char[] C = S.toCharArray();
		int num_A = 0;
		long res = 0;
		int Clen = C.length;
		for(int i=0;i<Clen;i++) {
			if(C[i]=='A') num_A++;
			else if(C[i]=='B'&&C[i+1]=='C') {
				res += num_A;
				i++;
			}
			else num_A = 0;
		}
		out.println(res);
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