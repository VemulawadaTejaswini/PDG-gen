import java.util.*;

class Main {
	Scanner sc;
	int[][] seg;
	int m;
	int N, Q;
	char[] S;
	static final int[] ZERO = new int[26];
	
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.next().toCharArray();
		Q = sc.nextInt();
		
		m = N-1;
		m = m | (m >>> 1);
		m = m | (m >>> 2);
		m = m | (m >>> 4);
		m = m | (m >>> 8);
		m = m | (m >>> 16);
		m += 1;
		
		seg = new int[2*m-1][26];
		
		for (int i = 0; i < S.length; i++) {
			int c = S[i] - 'a';
			seg[m-1+i][c] = 1;
		}
		for (int i = m-2; i >= 0; i--) {
			for (int j = 0; j < 26; j++)
				seg[i][j] = seg[i*2+1][j] + seg[i*2+2][j];
		}
		
		for (int i = 0; i < Q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				update(sc.nextInt()-1, sc.next().charAt(0));
			} else {
				calc(sc.nextInt()-1, sc.nextInt());
			}
		}
	}
	
	private void update(int index, char v) {
		int i = m-1+index;
		char o = (char)(S[index] - 'a');
		seg[i][o]--;
		seg[i][v - 'a']++;
		S[index] = v;
		
		while (i > 0) {
			i = (i-1) >>> 1;
			for (int j = 0; j < 26; j++) seg[i][j] = seg[i*2+1][j] + seg[i*2+2][j];
		}
	}
	
	private void calc(int s, int eExclusive) {
		int[] a = calcImpl(s, eExclusive, 0, 0, m);
		int v = 0;
		for (int i = 0; i < 26; i++) if (a[i] > 0) v++;
		System.out.println(v);
	}
	
	private int[] calcImpl(int s, int eExclusive, int n, int l, int r) {
		if (r <= s || eExclusive <= l) return ZERO;
		if (s <= l && r <= eExclusive) return seg[n];
		int[] buf = new int[26];
		int i = (l>>>1)+(r>>>1);
		int[] cl = calcImpl(s, eExclusive, 2*n + 1, l, i);
		int[] cr = calcImpl(s, eExclusive, 2*n + 2, i, r);
		for (int j = 0; j < 26; j++) buf[j] = cl[j] + cr[j];
		return buf;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
