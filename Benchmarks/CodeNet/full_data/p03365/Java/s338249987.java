import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<=4){
			if(N==2) System.out.println(1);
			if(N==3) System.out.println(4);
			else System.out.println(16);
			return;
		}
		long[] b = new long[(N+1)/2 + 1]; //n!
		long MOD = 1000000007;
		
		b[0] = 1;
		for(int i=1;i<=(N+1)/2;++i) b[i] = b[i-1] * i % MOD;
		
		int saitan = (N+1)/2; //最短手数
		long keisuu = (b[saitan] * b[N-1-saitan]) % MOD; 
		long ans = keisuu*saitan;
		if(N%2==1) ans *= 2;
		ans %= MOD;
		for(int p=saitan+1;p<N;p++){
			int hujun = p-saitan;
			long score = comb(p-2,hujun) % MOD;
			score = (score * keisuu * p) % MOD;
			ans += score;
			if(ans >= MOD) ans -= MOD;
			//System.out.println(p+" "+score+" "+ans);
		}
		System.out.println(ans);
		return;
	}
	
	public static long comb(int a,int b){
		int limit = Math.min(b, a-b);
		long ret = 1;
		for(int i=1;i<=limit;++i){
			ret *= (a+1-i);
			ret /= i;
		}
		return ret;
	}
}