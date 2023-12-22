import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt();
		String s = in.next();
		
		out.println(a>=3200? s : "red");
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}