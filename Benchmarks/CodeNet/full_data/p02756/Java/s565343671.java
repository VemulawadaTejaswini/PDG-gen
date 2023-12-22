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
		
		String s=inp.nextLine();
		int n=inp.nextInt();
		inp.nextLine();
		boolean reversed=false;
		char prev[]=new char[n];
		char next[]=new char[n];
		int pr=0,ne=0;
		for(int i=0;i<n;i++) {
			String x=inp.nextLine();
			if(x.charAt(0)=='1') {
				reversed= !reversed;
			}
			else {
				if(x.charAt(2)=='2' && !reversed) {
					next[ne++]=x.charAt(4);
				}
				else if(x.charAt(2)=='1' && reversed) {
					next[ne++]=x.charAt(4);
				}
				else {
					prev[pr++]=x.charAt(4);
				}
			}
		}
		StringBuilder y=new StringBuilder("");
			for(int i=pr-1;i>=0;i--) {
				y.append(prev[i]);
			}
			for(int i=0;i<s.length();i++) {
				y.append(s.charAt(i));
			}
			for(int i=0;i<ne;i++) {
				y.append(next[i]);
			}
		if(reversed) {
			y=y.reverse();
		}
		out.println(y);
		out.close();
		inp.close();
	}
}