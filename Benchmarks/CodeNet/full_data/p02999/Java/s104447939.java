import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int x = in.nextInt(), a = in.nextInt();
		out.println(x<a ? 0 : 10);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}