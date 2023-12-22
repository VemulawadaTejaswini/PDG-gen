//--- pB ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		String s = reader.ns();
		int N = s.length();
		String sa = s.substring(0, ((N-1)/2));
		String sb = s.substring( (N+3)/2 - 1 );

		if (isPalin(sa) && isPalin(sb)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		return;
	}
	private boolean isPalin(String s) {
		for (int i=0; i<s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
		}
		return true;
	}
}

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public String ns() {return this.next();}
}
