import java.util.*;
import java.io.*;

class Main {

	void solve() {
		
		int n = inint()*100 + inint()*10 + inint();
		out.println(n%4==0 ? "YES" : "NO");
		
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

	public char inchar() {
		return in.next().charAt(0);
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