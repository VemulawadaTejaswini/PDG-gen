import java.util.Scanner;

public class Main {
	static long MOD = 1000000007;
	static long modFact(int n){
		long ret = 1;
		for(int i = 2 ; i <= n ; ++i){
			ret = ret * i;
			ret = ret % MOD;
		}
		return ret;
	}
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
	static long modinv(long n){
		return modpow(n , MOD - 2);
	}
	static long modComb(int n , int k){
		long a1 = modFact(n);
		long a2 = modFact(k);
		long a3 = modFact(n - k);
//		System.out.println(a1+" "+a2+" "+a3);
//		System.out.println(modinv(a2 * a3));
		return (a1 * (modinv((a2 * a3) % MOD)) ) % MOD;
	}
	static long solve(int X , int Y){
		int xx = - X + 2 * Y;
		int yy = 2 * X - Y;
		if(xx < 0 || yy < 0 || xx % 3 != 0 || yy % 3 != 0){
			return 0;
		}
		xx = xx / 3;
		yy = yy / 3;
//		System.out.println(xx+" "+yy);
		return modComb(xx+ yy , xx);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		System.out.println(solve(X , Y));
	}
}
