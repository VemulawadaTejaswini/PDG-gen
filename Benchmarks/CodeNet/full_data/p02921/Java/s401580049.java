import java.util.*;
import java.io.*;

class Main {

	void solve () {

		char[] a = in.next().toCharArray(), b = in.next().toCharArray();
		int ans = 0;
		for (int i=0; i<3; i++) {
			if (a[i] == b[i]) ans++;
		}
		System.out.println(ans);
		
	}

	public static PrintWriter out = new PrintWriter(System.out);
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

}