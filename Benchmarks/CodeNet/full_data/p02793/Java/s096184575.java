import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		//int T = in.nextInt();
		//for(int t = 1; t <= T; ++t) {
			int n = in.nextInt();
			BigInteger a[] = new BigInteger[n];

			//System.out.print("Case " + t + ": ");
			BigInteger ans = in.nextBigInteger();
			a[0] = ans;
			for(int i = 1; i < n; ++i) {
				BigInteger x = in.nextBigInteger();
				a[i] = x;
				//BigInteger g = ans.gcd(x);
				if(ans.mod(x).equals(0)==false)ans = ans.multiply(x).divide(ans.gcd(x));
			}
			BigInteger res=new BigInteger("0");
			BigInteger mm=new BigInteger("1000000007");
			for(int i=0;i<n;i++){
				res = res.add(ans.divide(a[i]));
				res=res.mod(mm);
			}
			System.out.println(res);
			System.gc();
	}
}
