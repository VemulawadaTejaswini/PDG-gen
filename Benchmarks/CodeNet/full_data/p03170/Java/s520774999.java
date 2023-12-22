
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.math.*;
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
 
 
 
public class Main {
	
	static int k;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        	
        	int n=in.nextInt();
        	int k=in.nextInt();
        	int[] p=new int[n];
        	for(int i=0;i<n;i++) {
        		p[i]=in.nextInt();
        	}
        	boolean[] dp=new boolean[k+1];
        	for(int i=1;i<=k;i++) {
        		for(int j=0;j<n;j++) {
        			if(i-p[j]>=0) {
        				if(!dp[i-p[j]]) {
        					dp[i]=!dp[i-p[j]];
        					break;
        				}
        					
        				
        			}
        		}
        	}
        	if(dp[k]==true)
        		System.out.println("First");
        	else
        		System.out.println("Second");
        	//System.out.println(dp[k]);
        	
        }
        
    }
   
    	
    	
    	
    static String addBinary(String input0,String input1){
    	
    	BigInteger first=new BigInteger(input0, 2);
    	BigInteger second=new BigInteger(input1, 2);

    	BigInteger result=first.add(second);
    	String binResult=result.toString(2);
		return binResult;
    	
    	}
    	
    static boolean compBin(String a,String b) {
    	for (long i = 0; i < a.length(); i++) {
    	    if (a.charAt((int) i) == '1' && b.charAt((int) i) == '0') return true;
    	    if (b.charAt((int) i) == '1' && a.charAt((int) i) == '0') return false;
    	}
    	return true;
    }
    
    static long sumAP(long a, long d, long n) 
    { 
    	int mod = 1000000007;
    	long sum = (n*modInverse(2,mod)%mod) ; 
    	long temp = (n-1)%mod;
    	temp+= 2*a;
    	temp%=mod;
    	temp = (temp * d)%mod;
    	sum = (sum*temp)%mod;	
        return (long) sum; 
    }
    public static long digSum(long number) {
        long digitSum = 0;
 
        while (number > 0) {
            digitSum = digitSum + (number % 10);
            number = number / 10;
        }
 
        return digitSum;
    }
    
    static int comb(int n , int r)
	{
		if( r== 0 || n == r)
			return 1;
		else
			return comb(n-1,r)+comb(n-1,r-1);
	}
    public static long fexp(long x, long y, long p) {
    	long res = 1;      
        
       
        x = x % p;  
      
        while (y > 0) 
        { 
         
            if((y & 1)==1) 
                res = (res * x) % p; 
      
          
            y = y >> 1;  
            x = (x * x) % p;  
        } 
        return res; 
    	
    }
    static int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return gcd(b, a % b);  
          
    } 
    static long mod(String num, int a) 
    { 
          
        long res = 0; 
  
 
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) 
                                     - '0') % a; 
  
        return res; 
    } 
        
    
 
    static class InputReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public InputReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    
    }
    public static void sort(long[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        long[] temp = new long[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
    static long modInverse(int a, int m) 
    { 
        int g = gcd(a, m); 
        if (g != 1) {
        	
        }          
        else 
        { 
        	return  fexp(a, m - 2, m); 
        }
		return g; 
    } 
   
    
}