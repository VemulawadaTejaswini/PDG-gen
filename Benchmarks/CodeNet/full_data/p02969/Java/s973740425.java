import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int r = in.nextInt();
		out.println(3*r*r);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}