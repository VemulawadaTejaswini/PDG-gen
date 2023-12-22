//--- pE ---//
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

	int inf = (int)1e9+5;
	private void run_case() {
		int X = reader.ni();
		int Y = reader.ni();
		int A = reader.ni();
		int B = reader.ni();
		int C = reader.ni();

		Integer[] arr_a = new Integer[A];
		Integer[] arr_b = new Integer[B];
		Integer[] arr_c = new Integer[C];

		for (int i=0; i<A; i++) arr_a[i] = reader.ni();
		for (int i=0; i<B; i++) arr_b[i] = reader.ni();
		for (int i=0; i<C; i++) arr_c[i] = reader.ni();

		Arrays.sort(arr_a, Collections.reverseOrder());
		Arrays.sort(arr_b, Collections.reverseOrder());
		Arrays.sort(arr_c, Collections.reverseOrder());

		int iter_a = X - 1, iter_b = Y - 1, iter_c = 0;

		while (true) {
			int a = iter_a >= 0 ? arr_a[iter_a] : inf;
			int b = iter_b >= 0 ? arr_b[iter_b] : inf;

			if (iter_c == C || Math.min(a, b) >= arr_c[iter_c]) {
				break;
			}

			if (a < b) {
				iter_a --;
				iter_c ++;
			} else {
				iter_b --;
				iter_c ++;
			}
		}

		long res = 0;
		for (int i=0; i<=iter_a; i++) res += arr_a[i];
		for (int i=0; i<=iter_b; i++) res += arr_b[i];
		for (int i=0; i<iter_c; i++) res += arr_c[i];

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
