import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

    static long M=(long)1e9+7;
    
    public static void main(String[] args) {
        FastReader fs=new FastReader();
        int n = fs.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=fs.nextInt();
        }
        /*
		if(n==2){
        	System.out.println(Math.abs(arr[1]-arr[0]));
        }
        else if(n==3){
        	System.out.println(Math.min(Math.abs(arr[0]-arr[2]),Math.abs(arr[0]-arr[1])+Math.abs(arr[1]+arr[2])));
        }
        else{
            int[][]dp=new int[n][n];
		    for(int i=0;i<n;i++){
		    	for(int j=0;j<n;j++){
		    		dp[i][j]=0;
		    	}
		    }
		    dp[1][0]=Math.abs(arr[1]-arr[0]);
		    dp[2][0]=Math.abs(arr[2]-arr[0]);
		    dp[2][1]=dp[1][0]+Math.abs(arr[2]-arr[1]);
		    dp[3][1]=dp[1][0]+Math.abs(arr[3]-arr[1]);
		    dp[3][2]=Math.min(dp[2][0],dp[2][1])+Math.abs(arr[3]-arr[2]);
		    for(int i=4;i<n;i++){
		    	dp[i][i-2]=Math.min(dp[i-2][i-3],dp[i-2][i-4])+Math.abs(arr[i]-arr[i-2]);
		    	dp[i][i-1]=Math.min(dp[i-1][i-3],dp[i-1][i-2])+Math.abs(arr[i]-arr[i-1]);
        	}
        	System.out.println(Math.min(dp[n-1][n-3],dp[n-1][n-2]));
        }*/
        
        int[] dp=new int[n];
        for(int i=1;i<n;i++){
        	dp[i]=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
        }
        for(int i=2;i<n;i++){
        	dp[i]=Math.min(dp[i-2]+Math.abs(arr[i-2]-arr[i]),dp[i-1]+Math.abs(arr[i-1]-arr[i]));
        }
        System.out.println(dp[n-1]);
    }
    
    public static void p(int[]dp){
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
