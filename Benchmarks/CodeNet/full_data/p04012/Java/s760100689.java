import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arg = br.readLine();
		Solver s = new Solver();
		System.out.println(s.solve(arg));
	}

}

class Solver {

	String solve(String s) {

		int in[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			in[s.charAt(i) - 'a']++;
		}
		int t = 0;
		for (int j = 0; j < in.length; j++) {
			t |= (in[j] & 1);
		}
		if (t > 0)
			return "No";
		else
			return "Yes";

	}

}
