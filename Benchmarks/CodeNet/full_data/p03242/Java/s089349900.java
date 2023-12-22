import java.util.*;
import java.io.*;

class Main {

	void solve() {

		char[] a = incharar();
		for (int i=0; i<a.length; i++) {
			if (a[i] == '1') a[i] = '9';
			else if (a[i] == '9') a[i] = '1';
		}
		out.println(String.valueOf(a));
		
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
	
	public String instr() {
		return in.next();
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}
	
}