//--- pD ---//
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

	List<Long> list;
	int tar = (int)1e5 + 5;
	private void run_case() {
		int K = reader.ni();

		list = new ArrayList<>();

		for (int i=1; i<=10; i++) {
			char[] arr = new char[i];
			for (int j=1; j<=9; j++) {
				arr[0] = (char)('0' + j);
				dfs(i, 1, arr);
			}
		}

		System.out.println(list.get(K - 1));
		return;
	}

	private void dfs(int len, int idx, char[] arr) {
		if (list.size() > tar) return;
		if (idx == len) {
			list.add(Long.parseLong(String.valueOf(arr)));
			return;
		}

		char pv = arr[idx - 1];
		for (int i=-1; i<=1; i++) {
			if ((pv == '0' && i == -1) || (pv == '9' && i == 1)) continue;
			arr[idx] = (char)(pv + i);
			dfs(len, idx + 1, arr);
		}

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
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
