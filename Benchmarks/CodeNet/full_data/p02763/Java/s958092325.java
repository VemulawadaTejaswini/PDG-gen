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
	Scanner scanner;



	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}


	private void run_case() {
		int N = scanner.nextInt();
		String str = scanner.next();

		List<BIT> list_st = new ArrayList<>();
		for (int i=0; i<26; i++) list_st.add(new BIT(N+1));
		// SegmentTreeRSQ st = new SegmentTreeRSQ(1, N);
		for (int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			// int t = (int)list_st.get(idx).query(i + 1, i + 1);
			list_st.get(idx).addVal(i, 1);
		}

		int Q = scanner.nextInt();
		StringBuilder str_sb = new StringBuilder(str);
		for (;Q-->0;) {
			// int[] arr = strToIntArray(scanner.nextLine());
			// String[] vals = scanner.nextLine().split("\\s+");

			int q = scanner.nextInt();

			if (q == 1) {
				int i = scanner.nextInt();
				char c = scanner.next().charAt(0);
				int n = str_sb.charAt(i-1) - 'a';
				int m = c - 'a';

				// int t = (int)list_st.get(n).query(i, i);
				list_st.get(n).addVal(i-1, -1);

				str_sb.setCharAt(i-1, c);

				// t = (int)list_st.get(m).query(i, i);
				list_st.get(m).addVal(i-1, 1);
			} else {
				int l = scanner.nextInt()-1;
				int r = scanner.nextInt()-1;
				int cnt = 0;
				for (int i=0; i<26; i++) {
					if (list_st.get(i).getSum(l, r) > 0) cnt ++;
				}
				System.out.println(cnt);
			}
		}
		return;
	}


	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}
class BIT {
	public long[] arr;
	public BIT(int n) {
		arr = new long[n];
	}
	public long getSum(int i) {
		long sum = 0;
		for(i++;i > 0;i -= i&-i)sum += arr[i];
		return sum;
	}
	public long getSum(int l, int r) {
		return getSum(r) - getSum(l-1);
	}
	public void addVal(int i, long v) {
		if(v == 0)return;
		int n = arr.length;
		for(i++;i < n;i += i&-i)arr[i] += v;
	}
}
