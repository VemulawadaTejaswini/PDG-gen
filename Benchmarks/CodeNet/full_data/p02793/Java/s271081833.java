 package program;
// by lxk
 
 
import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		//int T = in.nextInt();
		//for(int t = 1; t <= T; ++t) {
			int n = in.nextInt();
			int a[1000000];
			a[0] = n;
			//System.out.print("Case " + t + ": ");
			BigInteger ans = in.nextBigInteger();
			for(int i = 1; i < n; ++i) {
				BigInteger x = in.nextBigInteger();
				a[i] = x;
				//BigInteger g = ans.gcd(x);
				ans = ans.multiply(x).divide(ans.gcd(x));
			}
			long long res=0;
			for(int i=0;i<n;i++){
				res += ans/a[i];
				res%=1000000007;
			}
			System.out.println(res);
			System.gc();
	//	}
		
	}
	
}