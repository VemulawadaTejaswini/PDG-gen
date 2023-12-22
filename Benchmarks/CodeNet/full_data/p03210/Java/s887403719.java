import java.util.*;
import java.io.*;

class Main {

	void solve() {

		int age = inint();
		if (age == 7 || age == 5 || age == 3) out.println("Yes");
		else out.println("No");
		
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