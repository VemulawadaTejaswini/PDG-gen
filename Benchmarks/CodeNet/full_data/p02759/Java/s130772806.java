//--- pA ---//
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
		try {
			while (reader.br.ready()) {
				run_case();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void run_case() {
		int N = ni();
		int res = (int)Math.ceil(1.0 * N / 2);
		System.out.println(res);
		return;
	}
	private int ni() {return Integer.parseInt(reader.next());}
	private String ns() {return reader.next();}
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
}
