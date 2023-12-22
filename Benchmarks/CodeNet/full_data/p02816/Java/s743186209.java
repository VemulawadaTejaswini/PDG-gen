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
	}
	
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
		
		base = 0;
		for (base = 0; base < N; base++) {
			int i = 0;
			for (; i < N; i++)
				if (c[(base+i)%N] != d[i]) break;
			if (i == N) break;
		}
		if (base == N) return;
		
		Set<Integer> divs = new TreeSet<>();
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if ((N%i)!=0) continue;
			if (!PRIMES.contains(i)) continue;
			divs.add(i);
			divs.add(N/i);
		}
		Map<Integer, Integer> ans = new TreeMap<>();
		for (int div : divs) 
			if (checkSeq(div))
				for (int i = div; i <= N; i += div)
					ans.put( (base+i)%N, a[(base+i)%N]^b[0] );
		
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
