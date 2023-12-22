import java.util.Scanner;

/**
 * https://abc065.contest.atcoder.jp/tasks/arc076_a
 */
public class Main {
	
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();
		
		long ans = 0;
		if(Math.abs(N-M)<=1){
			ans = getFactorial(N)*getFactorial(M)%MOD;
			if(N==M){
				ans = ans*2%MOD;
			}
		}
		
		System.out.println(ans);

	}
	
	static long getFactorial(long n){
		long a = 1;
		for(long i=1; i<=n; i++){
			a = a*i%MOD;
		}
		return a;
	}

}