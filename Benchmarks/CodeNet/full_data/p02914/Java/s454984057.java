import java.util.*;

public class Main {
	Scanner sc;
	int N;
	BitSet[] bs;
	long[] c = new long[60];
	long total = 0L;
	long result = 0L;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		bs = new BitSet[60];
		for (int i = 0; i < 60; i++) {
			bs[i] = new BitSet(N+60);
			bs[i].set(i);
		}
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			total ^= a;
			for (int j = 0; j < 60; j++)
				if ( (a & (1L<<j)) != 0) bs[j].set(i+60);
		}
		for (int i = 0; i < 60; i++)
			if ((total & (1L<<i)) != 0) bs[i].clear();
		try1();
		System.out.println(total+result*2);
	}
	
	private void sweepOut() {
		int i = 0;
		for (int bpos = N+59; bpos >= 0; bpos--) {
			for (int j = i; j < 60; j++) {
				if (!bs[j].get(bpos)) continue;
				BitSet tmp = bs[i]; bs[i] = bs[j]; bs[j] = tmp;
				long t = c[i]; c[i] = c[j]; c[j] = t;
				for (j = 0; j < 60; j++) {
					if (i == j || !bs[j].get(bpos)) continue;
					bs[j].xor(bs[i]);
					c[j] ^= c[i];
				}
				i++;
			}
		}
	}
	
	private void try1() {
	lp:
		for (int i = 59; i >= 0; i--) {
			long bit = 1L<<i;
			if ((total & bit) != 0L) continue;
			for (int j = 0; j < 60; j++) {
				if (bs[j].get(i)) {
					c[j] |= bit;
					bs[j].clear(i);
				}
			}
			sweepOut();
			for (int j = 0; j < 60; j++) {
				if (!bs[j].isEmpty() || (Long.bitCount(c[j])&1)==0) continue;
				for (int k = 0; k < 60; k++) c[k] &= (~bit);
				continue lp;
			}
			result |= bit;
		}
	}
	
	public static void main(String[] args) {
		new Main().calc();
		
	}
}
