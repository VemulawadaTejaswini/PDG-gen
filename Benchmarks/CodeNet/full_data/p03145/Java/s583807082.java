import java.util.*;
import java.io.*;

class Main {

	void solve() {

		int ab = inint(), bc = inint(), ca = inint();
		out.println(ab*bc/2);
		
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

}