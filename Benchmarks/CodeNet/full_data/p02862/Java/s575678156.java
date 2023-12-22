import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();

		long mod = (long)Math.pow(10,9)+7;
		
		if((2*X-Y)%3!=0) {
			System.out.println(0);
			return;
		}
		if((2*Y-X)%3!=0) {
			System.out.println(0);
			return;
		}
		long m = (2*X-Y)/3;
		long n = (2*Y-X)/3;
		
		
		//n+mCn を計算したい。
		FermatCombination com = new FermatCombination(n+m, mod);
		long ans = com.combine(n+m, n);
		System.out.println(ans);
		
	}
}

//フェルマーの小定理を用いた組み合わせ計算
class FermatCombination {
		
		long[] factrial;
		long[] inverse;
		long MOD;
		
		FermatCombination(long size, long mod) {
			
			this.factrial = new long[(int) size + 1];
			this.inverse = new long[(int) size + 1];
			this.MOD = mod;
			
			this.factrial[0] = 1;
			this.inverse[0] = 1;
			
			for (int i = 1; i <= size; i++) {
				factrial[i] = factrial[i - 1] * i % MOD;
				inverse[i] = pow(factrial[i], (int) MOD - 2) % MOD; //フェルマーの小定理
			}
		}
		
		long combine(long n, long k) {
			// nCk = n! / (k! * (n-k)!) 
			return factrial[(int) n] * inverse[(int) k] % MOD * inverse[(int)n - (int)k] % MOD;
		}
		
		long pow(long x, int n) {
			long ans = 1;
			while (n > 0) {
				if ((n & 1) == 1) {
					ans = ans * x % MOD;
				}
				x = x * x % MOD;
				n >>= 1;
			}
			return ans;
		}
	
}