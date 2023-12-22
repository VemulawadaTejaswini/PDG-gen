import java.util.*;

public class Main {
	Scanner sc;
	int N;
	BitSet[] bs;
	long total = 0L;
	
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
		int i = 0;
		for (int bpos = N+59; bpos >= 60; bpos--) {
			for (int j = i; j < 60; j++) {
				if (!bs[j].get(bpos)) continue;
				BitSet tmp = bs[i]; bs[i] = bs[j]; bs[j] = tmp;
				for (j = 0; j < 60; j++) {
					if (i == j || !bs[j].get(bpos)) continue;
					bs[j].xor(bs[i]);
				}
				i++;
			}
		}
		long result = 0L;
		long[] c = new long[60];
	lp:
		for (int bpos = 59; bpos >= 0; bpos--) {
			long bit = 1L<<bpos;
			if ((total & bit) != 0) continue;
			for (int j = 0; j < 60; j++) {
				if (bs[j].get(bpos)) {
					c[j] |= bit;
					bs[j].clear(bpos);
				}
			}
			for (int j = 0; j < 60; j++) {
				if (!bs[j].isEmpty() || (Long.bitCount(c[j])&1L)== 0L) continue;
				for (int k = 0; k < 60; k++) c[k] &= (~bit);
				continue lp;
			}
			result |= bit;
		}
		System.out.println(total+result*2);
	}
	
	public static void main(String[] args) {
		new Main().calc();
		
	}
}
