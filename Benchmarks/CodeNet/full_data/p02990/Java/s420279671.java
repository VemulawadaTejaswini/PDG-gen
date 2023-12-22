import java.math.BigInteger;
import java.util.*;
public class Main {
	
	public static BigInteger c(int n , int r)
	{
		if(r>n/2) return c(n,n-r);
		BigInteger x = BigInteger.ONE;
		for(int i = 0 ;i<r;i++)
			x = x.multiply(BigInteger.valueOf(n-i));
		for(int i = 0 ;i<r;i++)
			x = x.divide(BigInteger.valueOf(r-i));
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int r =n-k;
		
		for(int i=1;i<=k;i++)
		{		
			
			BigInteger pll = c(r+1,i);	
			BigInteger prt = c(k-1,i-1);
			//System.out.println(pll);
			//System.out.println(prt);
			System.out.println((pll.multiply(prt)).mod(BigInteger.valueOf(1000000007)));			
			
		}

	}

}
