import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		new ABC049B().solve();
	}
}

class ABC049B {
	void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hw = br.readLine();
		int h = Integer.parseInt(hw.split(" ")[0]);
		int w = Integer.parseInt(hw.split(" ")[1]);
		String[] c = new String[h];
		for (int i=0; i < h; i++) {
			c[i] = br.readLine();
		}
		for (int i=0; i < c.length; i++) {
			System.out.println(c[i]);
			System.out.println(c[i]);
		}
	}
}

class ABC049A {
	void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yes = "vowel";
		String no = "consonant";
		if (br.readLine().matches("a|e|i|o|u")) System.out.println(yes);
		else System.out.println(no);
	}
}
