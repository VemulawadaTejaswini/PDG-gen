    /* package whatever; // don't place package name! */
     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.math.BigInteger;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class Main
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		
    		// your code goes here
    		int i , n , co =0;
    		int a[] = new int[100002];
    		BigInteger ans = new BigInteger("0");
    		Scanner sc = new Scanner(System.in);
    		n = sc.nextInt();
    		a[n+1] = 0;
    		for(i=1;i<=n;i++)
    		{
    			a[i] = sc.nextInt();
    			ans = ans.add(BigInteger.valueOf(a[i]/2));
    			a[i] = a[i]%2;
    		}
    		for(i=1;i<=n;i++)
    		{
    			co = 0;
    			while(a[i] != 0 && i <= n)
    			{
    				i++;
    				co++;
    			}
    				ans = ans.add(BigInteger.valueOf(co/2));
    			
    		}
    		System.out.println(ans);
    	}
    }