import java.util.*;
import java.io.*;

class Main {

	void solve() {

		char[] a = incharar();
		int ans = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] == '1') ans++;
		}
		out.println(ans);

	}

	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	public int inint() {
		return in.nextInt();
	}

	public long inlong() {
		return in.nextLong();
	}
	
	public String instr() {
		return in.next();
	}

	public int[] inintar(int num) {
		int[] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}

}