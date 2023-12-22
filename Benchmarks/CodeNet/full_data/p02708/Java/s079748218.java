
import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;
	static long fac[];
	static long finv[];
	static long inv[];
	static int n , k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 n = Integer.parseInt(sc.next());
		 k = Integer.parseInt(sc.next());
		 
		 long []num = new long [n+2];
		 long []low = new long [n+2];
		 num[0] = 0;
		 low[0] = 0;
		 for(int i = n ; i >= 0 ; i--) {
			num[n-i+1] += i + num[n-i]; 
			low[n-i+1] += (n-i) + low[n-i];
			
		 }
		 
		
		long ans = 0;
		for(int i = k ; i <= n+1 ; i++) {
			ans = (ans + (num[i]-low[i]+1)) % mod;
		}
		
		System.out.println(ans);
		
	
	}	
}
