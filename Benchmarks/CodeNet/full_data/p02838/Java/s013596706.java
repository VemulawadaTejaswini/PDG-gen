import java.util.*;

class Main {
	static final int MOD = 1_000_000_007;
	Scanner sc;
	int N;
	int[] c;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		c = new int[60];
		
		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			for (int j = 0; j < 60; j++) {
				if ((a & 1)>0) c[j]++;
				a >>>= 1;
			}
		}
		long ans = 0L;
		long d = 1L;
		for (int j = 0; j < 60; j++) {
			ans = (ans + (long)c[j]*(N-c[j])*d) % MOD;
			d = (d * 2)%MOD;
		}
		System.out.println( ans );
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}