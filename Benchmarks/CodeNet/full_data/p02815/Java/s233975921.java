import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] C;
	static final int MOD = 1000_000_007;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		C = new int[N];
		for (int i = 0; i < N; i++) C[i] = sc.nextInt();
		Arrays.sort(C);
		long p = 1;
		for (int i = 0; i < N-1; i++) p = p * 2 % MOD;
		long pp = p * 2 % MOD;
		
		long a = p;
		long sum = 0;
		long d = (p%2==0)?p/2:(p+MOD)/2%MOD;
		for (int i = 0; i < N; i++) {
			sum = (a*C[N-1-i]%MOD + sum)%MOD;
			a = (a + d)%MOD;
		}
		sum = sum * pp % MOD;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
