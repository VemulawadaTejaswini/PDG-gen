import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
	
	
		long n=sc.nextLong();
		long m=sc.nextLong();
		
		long ans=0;
		
		if(2*n<=m)
		{
			ans+=n;
			m-=2*n;
		    ans+=m/4;		
		}
		else 
		{
		if(m%2!=0)	
		{
		ans=(m-1)/2;	
		}
		else 
		{
		ans=m/2;	
		}
		}
	System.out.println(ans);	
			
}
}
