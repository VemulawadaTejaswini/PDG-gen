
import java.util.Scanner;

public class Main{

	static int mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long []a = new long [n];
		
		long b = 0;
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Long.parseLong(sc.next());
		}
		long ans = 0;
		long p = 1;
		
		for(int i = 0 ;i < 60 ;i++) {
			long cnt = 0;
			for(int j = 0 ;j < n ;j++) {
				cnt += a[j] >>> i & 1;
			}
			long temp = (n - cnt) * cnt % mod;
			ans = (ans + temp * p % mod)%mod;
			
			p = p * 2 % mod;
		}
		
		System.out.println(ans);

	}

}
