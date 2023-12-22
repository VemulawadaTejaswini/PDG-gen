
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		long l = input.nextLong();
		
		long a = l/3;
		long mod = l%3;
		
		double ans = a*a*a;
		if(mod == 1){
		    ans = a*(a+1)*a;
		}
		else if(mod == 2){
		    ans = Math.max(a*(a+2)*a,a*(a+1)*(a+1));
		}
		
		System.out.println(ans);
	}
}
