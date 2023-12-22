import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007;
	static long modpow(long n, long y){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ret = 0;
		long A = 0;
		long memo[] = new long[K + 1];
		for(int i = K ; i >= 1 ; --i){
			long comb = modpow(K / i, N);
			for(int j = 2 ; j * i <= K ; ++j){
				comb = (comb - memo[i * j] + MOD) % MOD;
			}
			memo[i] = comb;
			A += comb;
			ret = (ret + comb * (long)i) % MOD;
		}
		System.out.println(ret);
	}
}
