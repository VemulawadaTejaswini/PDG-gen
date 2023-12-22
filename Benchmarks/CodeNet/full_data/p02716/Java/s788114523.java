//--- pF ---//
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
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		// int t = reader.ni();
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	long[] arr;
	int sel;
	int n;
	Long[][] mem;
	long inf = Long.MAX_VALUE;
	private void run_case() {
		n = reader.ni();
		arr = new long[n];
		for (int i=0; i<n; i++) {
			arr[i] = reader.nl();
		}
		sel = (int)Math.floor(n / 2.0);
		mem = new Long[n][sel];

		long res = dfs(0, 0);
		System.out.println(res);

		return;
	}

	private long dfs(int idx, int num) {
		if (num == sel) {
			return 0;
		}
		if (idx >= n) {
			return -inf;
		}

		if (mem[idx][num] != null) return mem[idx][num];

		int toSel = sel - num;
		int left = n - idx;

		if ( (int)Math.ceil(left / 2.0) < toSel) return -inf;

		long res = -inf;

		long t = dfs(idx + 1, num);
		if (t != -inf) res = Math.max(res, t);



		t = dfs(idx + 2, num + 1);
		if (t != -inf) res = Math.max(res, arr[idx] + t);

		mem[idx][num] = new Long(res);
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
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
