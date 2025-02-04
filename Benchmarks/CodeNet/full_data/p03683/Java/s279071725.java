import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long MOD = 1000000007;
		if(Math.abs(N-M)>=2){
			System.out.println("0");
			return;
		}
		
		long ans = 1;
		for(long i=2; i<=N; ++i){
			ans *= i;
			ans %= MOD;
		}
		for(long i=2; i<=M; ++i){
			ans *= i;
			ans %= MOD;
		}
		
		if(Math.abs(N-M)==0){
			ans*=2;
			if(ans>=MOD) ans -= MOD;
		}
		
		System.out.println(ans);
		return;
	}
}