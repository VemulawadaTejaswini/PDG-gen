import java.util.*;
import java.io.*;

class Main {

	void solve() {

		char[] a = incharar();
		int cost = 0;
		
		for (int i=0; i<a.length/2; i++) {
			if (a[i] != a[a.length-i-1]) cost++;
		}
		out.println(cost);

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