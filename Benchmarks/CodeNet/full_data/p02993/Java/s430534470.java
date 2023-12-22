import java.util.*;
import java.io.*;

class Main {

	void solve () {

		char[] ar = in.next().toCharArray();
		if (ar[0]==ar[1] || ar[1]==ar[2] || ar[2]==ar[3]) out.println("Bad");
		else out.println("Good");
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}