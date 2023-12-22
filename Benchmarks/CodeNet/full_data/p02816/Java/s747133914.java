import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] a, b, c, d;
	int base;
	
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
		
		int[][] cmap = new int[N][2];
		for (int i = 0; i < N; i++) { cmap[i][0] = c[i]; cmap[i][1] = i; }
		Arrays.sort(cmap, comp);
		int s = 0;
		int min = Integer.MAX_VALUE;
		int minv = -1;
		int cnt = 1;
		int idx = -1;
		for (int i = 0; i < N; i++) {
			if (i == N-1 || cmap[i][0] != cmap[i+1][0]) {
				if (cnt < min) {
					min = cnt;
					minv = cmap[i][0];
					idx = s;
				}
				s = i;
				cnt = 0;
			}
			cnt++;
		}
		int[][] dmap = new int[N][2];
		for (int i = 0; i < N; i++) { dmap[i][0] = d[i]*2; dmap[i][1] = i; }
		Arrays.sort(dmap, comp);
		int didx = -1-Arrays.binarySearch(dmap, 0, N, new int[] {2*minv-1}, comp);
		int dcnt = -1-Arrays.binarySearch(dmap, 0, N, new int[] {2*minv+1}, comp)-didx;
		
		base = -1;
		for (int j = 0; j < dcnt; j++) {
			int k = 0;
			for (; k < N; k++)
				if (c[(cmap[idx][1]+k)%N] != d[(dmap[j+didx][1]+k)%N]) break;
			if (k == N) {
				base = (N+cmap[idx][1]-dmap[j+didx][1])%N;
				break;
			}
		}
		if (base == -1) return;
		Set<Integer> divs = new TreeSet<>();
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if ((N%i)!=0) continue;
			divs.add(i);
			divs.add(N/i);
		}
		int[] ans = new int[N];
		for (int i = 0; i < N; i++) ans[i] = -1;
		ans[base] = a[base]^b[0];
		for (int div : divs) {
			if (ans[div%N] != -1) continue;
			if (checkSeq(div))
				for (int i = div; i <= N; i += div)
					ans[(base+i)%N] = a[(base+i)%N]^b[0];
		}
		for (int i = 0; i < N; i++)
			if (ans[i] > -1) System.out.println(i+" "+ans[i]);
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
