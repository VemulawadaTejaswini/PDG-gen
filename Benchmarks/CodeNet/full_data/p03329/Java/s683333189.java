import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] dp = new int[n+1];
			Arrays.fill(dp, 1 << 29);
			dp[0] = 0;
			for(int i = 0; i <= n; i++){
				if(i + 1 > n)continue;
				dp[i+1] = Math.min(dp[i+1], dp[i] + 1);
				
				int now = 6;
				while(i + now <= n){
					dp[i + now] = Math.min(dp[i + now], dp[i] + 1);
					now = now * 6;
				}
				
				now = 9;
				while(i + now <= n){
					dp[i + now] = Math.min(dp[i + now], dp[i] + 1);
					now = now * 9;
				}
			}
			System.out.println(dp[n]);
		}
	}
	
	private long calc(long n, long m, long l){
		long sum = 1;
		for(long i = n; i > m; i--){
			sum *= i;
		}
		for(long i = 2; i <= l; i++){
			sum /= i;
		}
		return sum;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
