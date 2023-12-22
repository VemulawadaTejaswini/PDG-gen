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
		while (scanner.hasNext()) {
			run_case();
		}
	}


	private void run_case() {
		int N = scanner.nextInt();
		String str = scanner.next();

		BIT[] bit = new BIT[26];
		for (int i=0; i<26; i++) {
			bit[i] = new BIT(N+1);
		}

		for (int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			bit[idx].addVal(i, 1);
		}

		int Q = scanner.nextInt();
		char[] str_sb = str.toCharArray();
		for (;Q-->0;) {
			int q = scanner.nextInt();

			if (q == 1) {
				int i = scanner.nextInt();
				char c = scanner.next().charAt(0);
				int n = str_sb[i-1] - 'a';
				int m = c - 'a';

				bit[n].addVal(i-1, -1);

				str_sb[i-1] = c;

				bit[m].addVal(i-1, 1);
			} else {
				int l = scanner.nextInt()-1;
				int r = scanner.nextInt()-1;
				int cnt = 0;
				for (int i=0; i<26; i++) {
					long t = bit[i].getSum(l, r);
					if (t > 0) cnt ++;
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
