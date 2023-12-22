
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		long k = input.nextLong();
		long sum = 0;
		
		for(long i=1;i<=k;i++){
		    for(long j=1;j<=k;j++){
		        for(long l=1;l<=k;l++){
		            long g1 = gcd(i,j);
		            long g2 = gcd(g1,l);
		            sum+=g2;
		        }
		    }
		}
		
		System.out.println(sum);
	}
}
