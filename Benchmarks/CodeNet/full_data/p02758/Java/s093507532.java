import java.util.*;

class Main {
	static final int MOD = 998244353;
	Scanner sc;
	int N;
	int[][] XD;
	int[] c;
	
	int[] seg;
	int m;
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		XD = new int[N*2][2];
		for (int i = 0; i < N; i++) {
			XD[i*2][0] = sc.nextInt();
			XD[i*2][1] = i*2;
			XD[i*2+1][0] = XD[i*2][0] + sc.nextInt();
			XD[i*2+1][1] = i*2+1;
		}
		Arrays.sort(XD,
			Comparator.comparingInt( (int[] xd) -> xd[0])
				.thenComparingInt( (int[] xd) -> 1-xd[1]%2));
		int[] d = new int[N];
		int i = 0;
		for (int j = 0; j < 2*N; j++) {
			int xd = XD[j][1];
			if (xd%2 == 0) d[xd/2] = i++;
		}
		
		c = new int[N];
		i = 0;
		for (int k = 0; k < 2*N; k++) {
			if (XD[k][1]%2 == 0) i++;
			else c[d[(XD[k][1]-1)/2]] = i - 1;
		}
		
		m = N-1;
		m = m | (m >>> 1);
		m = m | (m >>> 2);
		m = m | (m >>> 4);
		m = m | (m >>> 8);
		m = m | (m >>> 16);
		m += 1;
		
		seg = new int[2*m-1];
		for (int j = 0; j < N; j++) seg[m-1+j] = c[j];
		for (int j = m-2; j >= 0; j--)
			seg[j] = Math.max(seg[j*2+1], seg[j*2+2]);
		for (int j = N-1; j >= 0; j--) {
			c[j] = calc(j, c[j]+1);
			update(j, c[j]);
		}
		
		int[] off = new int[N];
		for (i = N-1; i >= 0; i--) {
			calcOnOff(off, i, c[i]);
		}
		calcOnOff(off, -1, N-1);
		System.out.println( ((long)off[0])%MOD );
	}
	
	private void calcOnOff(int[] off, int i, int e) {
		if (i == e) {
			off[i] = 1;
			return;
		}
		long _off = 1;
		int j = i+1;
		if (i == -1) i = 0;
		while (j <= e) {
			_off = (_off * (1 + off[j]))%MOD;
			j = c[j] + 1;
		}
		off[i] = (int)_off;
	}
	
	private void update(int index, int c) {
		int i = m-1+index;
		seg[i] = c;
		while (i > 0) {
			i = (i-1) >>> 1;
			seg[i] = Math.max(seg[i*2+1], seg[i*2+2]);
		}
	}
	
	private int calc(int s, int eExclusive) {
		return calcImpl(s, eExclusive, 0, 0, m);
	}
	
	private int calcImpl(int s, int eExclusive, int n, int l, int r) {
		if (r <= s || eExclusive <= l) return -1;
		if (s <= l && r <= eExclusive) return seg[n];
		int i = (l>>>1)+(r>>>1);
		int vl = calcImpl(s, eExclusive, 2*n + 1, l, i);
		int vr = calcImpl(s, eExclusive, 2*n + 2, i, r);
		return Math.max(vl, vr);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
