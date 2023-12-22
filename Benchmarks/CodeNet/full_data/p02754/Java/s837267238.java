// No sorceries shall prevail. //           
import java.util.*;
import java.io.*;
public class Main {
	
	static long gcd(long a, long b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	static int gcd(int a, int b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	
	static long mod = 1000000007;
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		long n=inp.nextLong();
		long a=inp.nextLong();
		long b=inp.nextLong();
		long gg=0;
		gg+=(n/(a+b))*a;
		n%=(a+b);
		gg+=Math.min(n, a);
		out.println(gg);
		
		out.close();
		inp.close();
	}
}