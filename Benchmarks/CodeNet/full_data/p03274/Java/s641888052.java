import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	
	private static int N=(int)Math.pow(10, 5);
	private static int n,k;
	private static BigInteger[] a;
	private static BigInteger ans;
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new BigInteger[N+5];
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextBigInteger();
		}
	     for(int i=1;i+k-1<=n;i++)
	    {  
	        int l=i,r=i+k-1;
	        ans=ans.min(a[r].divide(a[l]).add(a[l].abs().min(a[r].abs())));
	    }
		System.out.println(ans);
	}

}
