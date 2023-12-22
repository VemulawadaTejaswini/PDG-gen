/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int q = sc.nextInt();
		n = n + 1;
		long []a = new long[n];
		int i;
		for(i=0; i<q; i++)
		{
		    int x = sc.nextInt();
		    ++a[x];
		}
		for(i=1; i<n; i++)
		{
		    long x = k - (long)(q - a[i]);
		    if(x > 0)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
		
	}
}
