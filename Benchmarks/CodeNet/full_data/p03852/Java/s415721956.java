import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ABC049A p = new ABC049A();
		p.solve();
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
