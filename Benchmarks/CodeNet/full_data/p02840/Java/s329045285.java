import java.util.*;

class Main {
	Scanner sc;
	long N, X, D;
	Map<Integer, List<long[]>> f;
	Comparator<long[]> c;
	{
		c = Comparator.comparingLong(a -> a[0]);
		c = c.thenComparingLong(a -> a[1]);
	}
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		X = sc.nextLong();
		D = sc.nextLong();
		
		if (D == 0) {
			if (X == 0) System.out.println(0);
			else System.out.println(N+1);
			return;
		}
		if (D < 0) { X = -X; D = -D; }
		
		f = new HashMap<>((int)N*4/3+1);
		for (int k = 0; k <= N; k++) {
			int m = (int)(((k*X)%D+D)%D);
			long s = (X*k-m)/D+(k-1)*k/2;
			long e = (X*k-m)/D+(2L*N-k-1)*k/2;
			List<long[]> segs = f.get(m);
			if (segs == null) segs = new ArrayList<>();
			segs.add(new long[] {s, e});
			f.put(m, segs);
		}
		long cnt = 0;
		for (List<long[]> segs : f.values()) {
			segs.sort(c);
			long doneE = Long.MIN_VALUE;
			for (long[] seg : segs) {
				long s = Math.max(doneE+1, seg[0]);
				long e = seg[1];
				if (s > e) continue;
				cnt += e-s+1;
				doneE = e;
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
