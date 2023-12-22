 package program;
// by lxk
 
 
import java.util.*;
import java.math.*;
import java.io.*;
 
public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			BigInteger a[] = new BigInteger[n];
			BigInteger ans = in.nextBigInteger();
			a[0] = ans;
			for(int i = 1; i < n; ++i) {
				BigInteger x = in.nextBigInteger();
				a[i] = x;
				ans = ans.multiply(x).divide(ans.gcd(x));
			}
			BigInteger res=new BigInteger("0");
			BigInteger mm=new BigInteger("1000000007");
			for(int i=0;i<n;i++){
				BigInteger c = ans.divide(a[i]);
				c = c.mod(mm);
				res = res.add(c);
				res=res.mod(mm);
			}
			System.out.println(res);
			
	}
}