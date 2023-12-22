import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Pair implements Comparable<Pair>{
		long left;
		long right;
		public Pair(long l , long r) {
			left = l;
			right = r;
		}
		@Override
		public int compareTo(Pair o) {
			if(left == o.left) {
				return Long.compare(right, o.right);
			}
			return Long.compare(left, o.left);
		}
		@Override
		public String toString() {
			return left + " " + right + " " + (right - left + 1);
		}
	}
	static long len(List<Pair> ps) {
		if(ps.size() == 0) {
			return 0;
		}
		Pair p = ps.get(0);
		long l = p.left;
		long r = p.right;
		for(Pair pp : ps) {
			l = Math.max(l, pp.left);
			r = Math.min(r, pp.right);
		}
		if(l > r) {
			return 0;
		}
		return r - l + 1;
	}
	static long solve(long L[] , long R[]) {
		int N = L.length;
		if(N == 2) {
			return R[1] + R[0] - L[1] - L[0] + 2;
		}
		Pair ps[] = new Pair[N];
		int mi = 0;
		long mlen = 0;
		for(int i = 0 ; i < N ; ++i) {
			ps[i] = new Pair(L[i] , R[i]);
			long len = ps[i].right - ps[i].left + 1;
			if(mlen < len) {
				mlen = len;
				mi = i;
			}			
		}
		long ret = 0;
		{
			List<Pair> l1 = new ArrayList<>();
			List<Pair> l2 = new ArrayList<>();
			l1.add(ps[mi]);
			for(int i = 0 ; i < N ; ++i) {
				if(i != mi) {
					l2.add(ps[i]);					
				}
			}
			long ll = len(l1) + len(l2);
			ret = Math.max(ll, ret);
		}
		Arrays.sort(ps);
		long mls1[] = new long[N];
		long mrs1[] = new long[N];
		mls1[0] = ps[0].left;
		mrs1[0] = ps[0].right;
		long mls2[] = new long[N];
		long mrs2[] = new long[N];
		mls2[N - 1] = ps[N - 1].left;
		mrs2[N - 1] = ps[N - 1].right;
		for(int i = 1 ; i < N ; ++i) {
			mls1[i] = Math.max(mls1[i - 1], ps[i].left);
			mrs1[i] = Math.min(mrs1[i - 1], ps[i].right);
		}
		for(int i = N - 2 ; i >= 0 ; --i) {
			mls2[i] = Math.max(mls2[i + 1], ps[i].left);
			mrs2[i] = Math.min(mrs2[i + 1], ps[i].right);			
		}
		for(int i = 1 ; i < N ; ++i) {
			long l0 = mls1[i - 1];
			long r0 = mrs1[i - 1];
			long l1 = mls2[i];
			long r1 = mrs2[i];
			long ll = 0;
			if(l0 <= r0) {
				ll += r0 - l0 + 1;
			}
			if(l1 <= r1) {
				ll += r1 - l1 + 1;				
			}
			ret = Math.max(ret, ll);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long L[] = new long[N];
		long R[] = new long[N];
		for(int i = 0 ; i < N ; ++i) {
			L[i] = sc.nextLong();
			R[i] = sc.nextLong();
		}
		System.out.println(solve(L, R));
	}
}
