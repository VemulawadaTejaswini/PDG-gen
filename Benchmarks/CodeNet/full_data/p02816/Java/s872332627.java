import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] a, b, c, d;
	int base;
	static final Set<Integer> PRIMES;
	static {
		PRIMES = new TreeSet<>();
		int n = (int)Math.sqrt(200000);
		for (int i = 1; i <= n; i++) {
			int m = (int)Math.sqrt(i);
			int j = 2;
			for (; j <= m; j++)
				if (i%j == 0) break;
			if (j > m) PRIMES.add(i);
		}
		System.out.println(PRIMES);
	}
	
	static Comparator<int[]> comp = Comparator.comparingInt(e -> e[0]);
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		a = new int[N];
		b = new int[N];
		c = new int[N];
		d = new int[N];
		for (int i = 0; i < N; i++) a[i] = sc.nextInt();
		for (int i = 0; i < N; i++)	b[i] = sc.nextInt();
		for (int i = 0; i < N; i++) c[i] = a[i] ^ a[(i+1)%N];
		for (int i = 0; i < N; i++) d[i] = b[i] ^ b[(i+1)%N];
		
		Map<Integer, Integer> cdist = new HashMap<>();
		for (int i = 0; i < N; i++)
			cdist.put(c[i], cdist.getOrDefault(c[i], 0)+1);
		
		Map<Integer, Integer> ddist = new HashMap<>();
		for (int i = 0; i < N; i++)
			ddist.put(d[i], ddist.getOrDefault(d[i], 0)+1);
		
		int[][] cmap = new int[N][2];
		for (int i = 0; i < N; i++) { cmap[i][0] = c[i]; cmap[i][1] = i; }
		Arrays.sort(cmap, comp);
		
		int[][] dmap = new int[N][2];
		for (int i = 0; i < N; i++) { dmap[i][0] = d[i]; dmap[i][1] = i; }
		Arrays.sort(dmap, comp);
		
		int min = Integer.MAX_VALUE;
		int minn = -1;
		for (int n : cdist.keySet()) {
			int v = cdist.get(n);
			if (v < min) {
				min = v;
				minn = n;
			}
		}
		
		base = -1;
		int[] key = new int[] {minn};
		int i = Arrays.binarySearch(cmap, 0, N, key, comp);
		if (i < 0) return;
		while (i >= 0 && cmap[i][0] == minn) i--;
		i++;
	lp:
		for (; i < N && cmap[i][0] == minn; i++) {
			int j = Arrays.binarySearch(dmap, 0, N, key, comp);
			if (j < 0) return;
			while (j >= 0 && dmap[j][0] == minn) j--;
			j++;
			for (; j < N && dmap[j][0] == minn; j++) {
				int k = 0;
				for (; k < N; k++)
					if (c[(cmap[i][1]+k)%N] != d[(dmap[j][1]+k)%N]) break;
				if (k == N) {
					base = (N+cmap[i][1]-dmap[j][1])%N;
					break lp;
				}
			}
		}
		if (base == -1) return;
		
		Set<Integer> divs = new TreeSet<>();
		for (i = 1; i <= Math.sqrt(N); i++) {
			if ((N%i)!=0) continue;
			if (PRIMES.contains(i)) divs.add(i);
			if (PRIMES.contains(N/i)) divs.add(N/i);
		}
		Map<Integer, Integer> ans = new TreeMap<>();
		ans.put( base, a[base]^b[0] );
		for (int div : divs) {
			if (ans.containsKey(div)) continue;
			if (checkSeq(div))
				for (i = div; i <= N; i += div)
					ans.put( (base+i)%N, a[(base+i)%N]^b[0] );
		}
		
		for (int k : ans.keySet()) System.out.println(k+" "+ans.get(k));
	}
	
	private boolean checkSeq(int div) {
		if (div == N) return true;
		for (int i = 0; i < N; i++)
			if (c[i] != c[(i+div)%N]) return false;
		return true;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
