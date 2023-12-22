import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt();
		System.out.println(a*a);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}