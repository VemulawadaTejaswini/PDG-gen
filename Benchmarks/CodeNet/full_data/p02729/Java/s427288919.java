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
		while (reader.hasNext()) {
			run_case();
		}
	}

	int[] fact;
	private void run_case() {
		int N = reader.ni(), M = reader.ni();

		fact = buildFact(105);

		long res = nCr(N, 2) + nCr(M, 2);
		System.out.println(res);

		return;
	}

	private int[] buildFact(int n) {
		int[] fact = new int[n+1];
		fact[0] = 1;
		for (int i=1; i<n+1; i++) {
			fact[i] = fact[i-1] * i;
		}
		return fact;
	}

	private long nCr(int n, int r) {
		if (n < r) return 0;
		long res = 1;
		for (long i=n-r+1; i<=n; i++) {
			res *= i;
		}
		for (long i=2; i<=r; i++) {
			res /= i;
		}
		return res;
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
