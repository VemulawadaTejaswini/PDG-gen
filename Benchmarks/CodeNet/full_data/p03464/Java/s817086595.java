import java.util.*;
import java.io.*;


public class Main {
	
	public static long execute(long[] s, long n) {
		long m = n;
		for(int i = 0; i < s.length; i++) {
			m = m - (m % s[i]);
		}
		//System.err.println(n + " resulted in " + m);
		return m;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split("\\s++");
		long[] k = new long[s.length];
		for(int i = 0; i < s.length; i++) {
			k[i] = Integer.parseInt(s[i]);
		}
		long hi = Long.MAX_VALUE;
		long lo = 2;
		long max = -1;
		long min = -1;
		long t;
		if(execute(k, hi) == 2) max = hi;
		else {
			// find first value that does not work due to exceeding
			while(lo < hi) {
				t = (hi / 2) + (lo / 2) + (((hi % 2) + (lo % 2))/2); // t = hi + lo / 2
				if(execute(k, t) <= 2) lo = t + 1;
				else hi = t;
			}
			max = hi - 1;
			hi = Long.MAX_VALUE;
			lo = 2;
		}
		if(execute(k, lo) == 2) min = lo;
		else {
			while(lo < hi) {
				//find last value that does not work due to under
				t = (hi / 2) + (lo / 2) + ((1 + (hi % 2) + (lo % 2))/2); // t = hi + lo / 2
				if (t < 0) {
					min = Long.MAX_VALUE;
					break;
				}
				if(execute(k, t) >= 2) hi = t - 1;
				else lo = t;
			}
			min = lo + 1;
		}
		if(min > max) System.out.println(-1);
		else System.out.println(min + " " + max);
	}
}