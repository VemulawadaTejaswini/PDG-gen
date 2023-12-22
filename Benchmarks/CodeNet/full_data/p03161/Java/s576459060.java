import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

    static long M=(long)1e9+7;
    
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        long n=fs.nextLong();
        long k=fs.nextLong();
        long[]arr=new long[(int)n];
        for(int i=0;i<n;i++){
        	arr[i]=fs.nextLong();
        }
        long[] dp=new long[(int)n];
        for(int i=0;i<n;i++){
        	dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=1;i<n;i++){
        	for(int j=1;j<=k;j++){
        		if((i-j)>=0){
        			dp[i]=Math.min(dp[i],dp[i-j]+Math.abs(arr[i]-arr[i-j]));
        		}
        	}
        }
        System.out.println(dp[(int)n-1]);
    }
        
    public static void p(long[]dp){
    		for(int j=0;j<dp.length;j++){
    			System.out.print(dp[j]+"  ");
    		}
    		System.out.println();
    	
    }
    
    public static long inv(long a, long mod){
        return pow(a, mod-2,mod);
    }
    public static long mul(long a,long b,long mod){
        long res=0;
        while(b!=0){
            if ((b & 1) == 1){ res = (res + a) % mod;}
            a = (a + a) % mod;
            b >>= 1;
        }
        return res;
    }
    
    public static long pow(long a, long n, long mod){
        long res=1;
        while(n != 0){
            if ((n & 1) == 1) res = mul(res, a, mod)%mod;
            a = mul(a , a, mod)%mod;
            n >>= 1;
        }
        return res;
    }
    
    public static long gcd(long a, long b){
        if(a == 0) return b;
        return b == 0 ? a: gcd(b, a % b);
    }

    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
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
}