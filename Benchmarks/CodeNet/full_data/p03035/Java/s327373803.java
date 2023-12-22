import java.util.*;
import java.io.*;

class Main {

	void solve () {

		int a = in.nextInt(), b = in.nextInt();
		int ans = 0;
		
		if (a >= 13) ans = b;
		else if (a >= 6 && a <= 12) ans = b/2;
		else ans = 0;
		
		out.println(ans);
		
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}