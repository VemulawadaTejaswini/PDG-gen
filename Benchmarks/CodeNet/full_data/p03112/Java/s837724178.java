import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long[] s = new long[A];
		long[] t = new long[B];
		long x;
		for(int i=0;i<A;i++) {
			s[i] = sc.nextLong();
		}
		for(int i=0;i<B;i++) {
			t[i] = sc.nextLong();
		}
		for(int i=0;i<Q;i++) {
			x = sc.nextLong();
			long[] slr = bins(s,x);
			long[] tlr = bins(t,x);
			System.out.println(minleng(x,slr[0],slr[1],tlr[0],tlr[1]));
			
		}
		
	}
	
	public static long[] bins(long[] s, long x) {
		long[] ret = new long[2];
		int sr = Arrays.binarySearch(s,x);
		if (sr < 0) sr = -sr-1;
		long maxinf = Long.MAX_VALUE/10;
		ret[0] = (sr-1>=0 && sr-1<s.length)? s[sr-1] : maxinf;
		ret[1] = (sr>=0 && sr<s.length)? s[sr] : maxinf;
		//System.out.println(ret[0] + " " + ret[1]);
		return ret;
	}
	
	public static long minleng(long x, long sl, long sr, long tl, long tr) {
		long c1 = Math.max(Math.abs(x-tr), Math.abs(x-sr));
		long c2 = Math.max(Math.abs(x-tl), Math.abs(x-sl));
		long c3 = Math.abs(tr-sl) + Math.min(Math.abs(x-tr), Math.abs(x-sl));
		long c4 = Math.abs(sr-tl) + Math.min(Math.abs(x-tl), Math.abs(x-sr));
		//System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
		return Math.min(Math.min(c1, c2),Math.min(c3,c4));
	}
}
