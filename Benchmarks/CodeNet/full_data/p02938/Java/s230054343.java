import java.util.*;

public class Main {
	Scanner sc;
	long L, R;
	
	private static long MOD = 1000000007L;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		L = sc.nextLong();
		R = sc.nextLong();
		
		System.out.println(count(0, 0, 63));
		System.out.flush();
	}
	
	private long count(long x, long y, int maskn) {
		if ( (x|y) != 0 && (y>>>1) >= x) return 0L;
		if (R < x || R < y) return 0L;
		long mask = (1L << maskn) - 1L;
		if ((y | mask) < L || (x | mask) < L) return 0L;
		if (L <= x && (y | mask) <= R) {
			if (maskn == 0) return 1L;
			return (3 * count(x, y | mask, maskn-1))%MOD;
		}
		maskn--;
		long nextBit = (mask >>> 1)+1L;
		long su = count(x | nextBit, y | nextBit, maskn);
		long sl = count(x, y, maskn);
		long sm = -1;
		if (x != y)
			if ( L < x ) sm = su;
			else if ( (y | mask) < R) sm = sl;
		if (sm == -1) sm = count(x, y | nextBit, maskn);
		return (sl+sm+su) % MOD;
	}
	public static void main(String[] args) {
		new Main().calc();
	}

}