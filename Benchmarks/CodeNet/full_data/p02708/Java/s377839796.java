import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007;
	static long solve(long N , long K){
		long ret = 0;
		for(long k = K ; k <= N + 1 ; ++k){
			long low = k * (k - 1) / 2;
			long high = k * (2 * N - k + 1) / 2;
			ret = (ret + high - low + 1) % MOD;
//			System.out.println(high+" "+low);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		System.out.println(solve(N , K));
	}
}
