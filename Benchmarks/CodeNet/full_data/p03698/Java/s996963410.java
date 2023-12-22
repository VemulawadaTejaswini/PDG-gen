
import java.util.*;
import java.io.*;

public class Main {

	private static final int mod =(int)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	  String s=sc.next();
	  int freq[]=new int[27];
	  for(int i=0;i<s.length();i++) {
	    freq[s.charAt(i)-'a']++;
	  }
	  for(int i=0;i<27;i++) {
	    if(freq[i]>1) {
	      System.out.println("no");
	      return;
	    }
	  }
	  System.out.println("yes");
	}

static long nCr(int n, int r, 
    int p) 
{ 


if (r == 0) 
return 1; 


int[] fac = new int[n + 1]; 
fac[0] = 1; 

for (int i = 1; i <= n; i++) 
fac[i] = fac[i - 1] * i % p; 

return (fac[n] * modInverse(fac[r], p) 
% p * modInverse(fac[n - r], p) 
% p) 
% p; 
} 
static long modInverse(int n, int p) 
{ 
    return pow(n, p - 2)%mod; 
} 
static long pow(long x,long y) {
  long res=1l;
  while(y!=0) {
    if(y%2==1) {
      res=x*res%mod;
    }
    y/=2;
    x=x*x%mod;
  }
  return res;
} 
}


