import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

    static long M=(long)1e9+7;
    
    public static int recur(int []arrr,int n){
    	if(n<=0){
    		return 0;
    	}
    	return recur(arrr,n-1)+arrr[n-1];
    }
    
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        int n=fs.nextInt();
        int [][]arr=new int[n][3];
        for(int i=0;i<n;i++){
        	arr[i][0]=fs.nextInt();
        	arr[i][1]=fs.nextInt();
        	arr[i][2]=fs.nextInt();
        }
        int [][]dp=new int[n][3];
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        for(int i=1;i<n;i++){
        	for(int j=0;j<3;j++){
        		int m=0;
        		for(int k=0;k<3;k++){
        			if(k!=j){
        				m=Math.max(dp[i-1][k],m);
        			}
        		}
        		dp[i][j]=m+arr[i][j];
        	}
        }
        int a=Math.max(dp[n-1][0],dp[n-1][1]);
        a=Math.max(a,dp[n-1][2]);
        System.out.println(a);
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
