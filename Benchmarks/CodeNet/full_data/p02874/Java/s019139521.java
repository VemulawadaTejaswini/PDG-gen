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
		for(int i = 0 ; i < N ; ++i) {
			ps[i] = new Pair(L[i] , R[i]);
		}
		long ret = 0;
		{
			List<Pair> l1 = new ArrayList<>();
			List<Pair> l2 = new ArrayList<>();
			l1.add(ps[0]);
			for(int i = 1 ; i < N ; ++i) {
				l2.add(ps[i]);
			}
			long ll = len(l1) + len(l2);
			ret = Math.max(ll, ret);
		}
		for(int i = 0 ; i < N ; ++i) {
			for(int j = 0 ; j < N ; ++j) {
				long l = L[i];
				long r = R[j];
				List<Pair> l1 = new ArrayList<>();
				List<Pair> l2 = new ArrayList<>();
				for(Pair p : ps) {
					if(p.left <= l && r <= p.right) {
						l1.add(p);
					}else {
						l2.add(p);						
					}
				}
				long ll = len(l1) + len(l2);
				ret = Math.max(ll, ret);
			}
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
