
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
		long n = input.nextLong();
		long m = input.nextLong();
		
		long ans = (n*(n-1))/2 + (m*(m-1))/2;
		System.out.println(ans);
	}
}
