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
		int H = reader.ni(), W = reader.ni();
		long mv_w_a = (long)Math.ceil(1.0 * W / 2);
		long mv_w_b = (long)Math.floor(1.0 * W / 2);
		long mv_h_a = (long)Math.ceil(1.0 * H / 2);
		long mv_h_b = (long)Math.floor(1.0 * H / 2);
		long sum_a = mv_w_a * mv_h_a;
		long sum_b = mv_w_b * mv_h_b;

		long res = sum_a + sum_b;
		System.out.println(res);

		return;
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
