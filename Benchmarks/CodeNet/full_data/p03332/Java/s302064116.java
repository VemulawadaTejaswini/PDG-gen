
import java.util.Scanner;

public class Main {

	public static long MOD = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long[] comb =  new long[n+1];
		comb[0]=1;

		for (int i=1;i<=n;i++) {
			comb[i]=div(((comb[i-1]*(n-i+1))%MOD),i,MOD);
		}

		long ans = 0;

		for (int i=0;i<=n;i++) {
			if ((k-a*i)%b==0 && 0<=(k-a*i)/b && (k-a*i)/b <= n) {
				ans += comb[i]*comb[(int) ((k-a*i)/b)];
				ans %= MOD;
			}
		}
		System.out.println(ans);
	}

	public static long pow(long a, long b, long mod) {
		if(b==0) {
			return 1;
		} else {
			long c = pow(a,b/2,mod);
			return ((c*c%mod)*(b%2==1?a:1))%mod;
		}
	}

	public static long div(long a, long b, long mod) {
		return (a*pow(b,mod-2,mod)%mod);
	}


}
