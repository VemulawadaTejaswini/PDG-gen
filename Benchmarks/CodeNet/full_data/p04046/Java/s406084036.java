import java.util.Scanner;

/**
 * https://abc042.contest.atcoder.jp/tasks/arc058_b
 */
public class Main {

	static final int MOD = 1000000007;
	static long[] modDp;
	static long[] modInvDp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int N = H+W-2;
		modDp = new long[N+1];
		modInvDp = new long[N+1];
		modDp[0] = 1; 
		for (int i=1; i<=N; i++) modDp[i] = getMod(modDp[i-1]*i);
		modInvDp[N] = getInverse(modDp[N]);
		for (int i=N; i>0; i--) modInvDp[i-1] = modInvDp[i]*i % MOD;
		
		long ans = 0;
		for(int x=B+1; x<=W; x++){
			ans = (ans + getCombination((x-1)+(H-A-1),x-1)*getCombination((A-1)+(W-x),A-1))%MOD;
		}
		System.out.println(ans);
		
	}
	
	
	static long getCombination(int n, int r){
		long ans = modDp[n];
		ans = ans*modInvDp[r] % MOD;
		ans = ans*modInvDp[n-r] % MOD;
		return ans;
	}

	static long getInverse(long a) {
		return getPower(a, MOD-2);
	}
	
	static long getMod(long a){
		return a>=0 ? a%MOD : MOD + a%MOD;
	}
	
	static long getPower(long n, long m) {
		if(m==0){
			return 1;
		}else if(m%2==0){
			return getPower(getMod(n*n), m/2);
		}else{
			return getMod(n*getPower(n,m-1));
		}
	}
}
