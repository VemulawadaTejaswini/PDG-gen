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
		int n = reader.ni();
		int m = reader.ni();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) arr[i] = reader.ni();

		int sum = 0;
		for (int u : arr) sum += u;

		double th = (1.0 / (4.0 * m)) * sum;

		int cnt = 0;
		for (int u : arr) {
			if (u >= th) {
				cnt ++;
			}
		}

		if (cnt >= m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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
	public String ns() {return this.next();}
}
