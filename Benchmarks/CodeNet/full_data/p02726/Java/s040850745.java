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
		
		int n=inp.nextInt();
		int x=inp.nextInt();
		int y=inp.nextInt();
		int ways[]=new int[n+1];
		for(int i=1;i<n;i++) {
			int z=0;
			for(int j=i+1;j<=n;j++) {
				z=Math.min(j-i, Math.abs(x-i)+1+Math.abs(y-j));
				ways[z]++;
			}
		}
		for(int i=1;i<n;i++) {
			out.println(ways[i]);
		}
		out.close();
		inp.close();
	}
}