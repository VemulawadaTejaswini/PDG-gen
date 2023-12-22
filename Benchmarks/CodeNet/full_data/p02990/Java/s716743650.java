import java.util.*;
 
public class Main {
    public static void main(String[] args){
		long mod = 1_000_000_007;
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long blue = k;
		long red = n-blue;
		long ans = 0;
		for(int i=1; i<=k; i++){
			if(i == 1){
				ans = (modCombination(red+1,i,mod)*i)%mod;
				System.out.println(ans);
			} else {
				ans = (modCombination(red+1,i,mod)*modCombination(blue-1, i-1, mod))%mod;
				System.out.println(ans);
			}
		}

	}
		// modPow 全てlongで渡す
		public static long modPow(long base, long exp, long mod) {
			if (exp == 0)
				return 1;
			if (exp == 1)
				return base % mod;
			if (exp % 2 == 1)
				return (base * modPow(base, exp - 1, mod) % mod);
			long tmp = modPow(base, exp / 2, mod);
			return (tmp * tmp) % mod;
		}
	
		// nCrの値を引数で渡したmodで割った余りをlong型で返す。フェルマーの小定理の条件により、modは素数に限る
		public static long modCombination(long n, long r, long mod) {
			long top = 1;
			long bottom = 1;
			for (int i = 1; i <= r; i++) {
				top *= n;
				top %= mod;
				n--;
				bottom *= i;
				bottom %= mod;
			}
			bottom = modPow(bottom, mod-2, mod);
			return (top * bottom) % mod;
		}
}
