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
	int mod = (int)1e9+7;
	Reader reader;
	public Solution () {
		reader = new Reader();
		while (reader.hasNext()) {
			run_case();
		}
	}

	int[] fact;
	private void run_case() {
		int n = reader.ni();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) arr[i] = reader.ni();

		Map<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<n; i++) {
			map.putIfAbsent(arr[i], 0);
			map.put(arr[i], map.get(arr[i]) + 1);
		}

		fact = new int[101];
		fact[0] = 1;
		for (int i=1; i<101; i++) {
			fact[i] = fact[i-1] * i;
		}

		long res = 0;
		for (int u : map.values()) {
			res += nCr(u, 2);
		}

		long[] resArr = new long[n];
		Arrays.fill(resArr, res);

		for (int i=0; i<n; i++) {
			resArr[i] -= (map.get(arr[i]) - 1);
		}

		for (int i=0; i<n; i++) {
			System.out.println(resArr[i]);
		}
		return;

	}

	private long nCr(int n, int r) {
		if (n < r) return 0;
	    // return fact[n] / fact[n - r] / fact[r];
		long res = 1;
		for (long i=n-r+1; i<=n; i++) {
			res *= i;
		}
		res /= 2;
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
