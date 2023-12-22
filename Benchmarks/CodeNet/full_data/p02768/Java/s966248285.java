import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		long ans = ((pow(2, n) -1) - comb(n, a) - comb(n, b) + 3*MOD) % MOD; 
		
		System.out.println(ans);
		sc.close();
	}
	
	static long pow(long a, long b) {
		long ans = 1;
		while(b>0) {
			if((b&1)!=0)
				ans = (ans * a)%MOD;
			b>>=1;
			a = (a*a)%MOD;
		}
		return ans;
	}
	
	static long rev(long a) {
		return pow(a, MOD-2);
	}

	static long comb(long a, long b) {
		long ans = 1;
		for(long i=0; i<b; i++) {
			ans = (ans * (a-i)) % MOD;
			ans = (ans * rev(i+1)) % MOD;
		}
		
		return ans;
	}
}
