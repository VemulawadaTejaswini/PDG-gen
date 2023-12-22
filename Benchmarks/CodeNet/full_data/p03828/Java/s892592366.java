import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://abc052.contest.atcoder.jp/tasks/arc067_a
 */
public class Main {

	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long[] factors = new long[N+1];
		List<Integer> primes = new ArrayList<>();
		for(int i=2; i<=N; i++){
			if(isPrime(i)) primes.add(i);
		}
		
		for(int n=2; n<=N; n++){
			int a = n;
			for(int p:primes){
				while(a%p==0 && a>1){
					factors[p]++;
					a=a/p;
				}
			}
		}
		
		long ans = 1;
		for(long f:factors){
			ans = (ans*(f+1))%MOD;
		}
		System.out.println(ans);

	}
	
	static boolean isPrime(long num) {
		if(num==2) return true;
		if(num<2 || num%2==0) return false;
		for(int i=3; i*i<=num; i+=2){
			if(num%i==0) return false;
		}
		return true;
	}

}
