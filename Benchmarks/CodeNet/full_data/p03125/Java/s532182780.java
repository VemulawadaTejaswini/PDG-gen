import java.util.*;
import java.io.*;
import java.time.*;

class Main {

	void solve() {

		int a = in.nextInt(), b = in.nextInt();
		out.println(b%a==0 ? a+b : b-a);
		
	}
	
	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}