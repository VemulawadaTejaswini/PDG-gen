import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
public class Main {
    
    public static final long max = (long)1e18+1; 
    
    public static void main(String args[] ) throws Exception {
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        long w = sc.nextLong();
        long[] a = new long[n];
        int[] v = new int[n];
        int su =0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
            v[i] = sc.nextInt();
            su+=v[i];
        }
        
        long[] dp = new long[su+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=su-v[i];j>=0;j--){
                int t = j+v[i];
                if(t>=0)
                    dp[t] = (dp[t]>dp[j]+a[i])?dp[j]+a[i]:dp[t];
            }
        }
        for(int j=0;j<=su;j++){
            if(dp[j]<=w){
                ans = Math.max(ans,j);
            }       
        }
        str.append(ans);
        //deb(Arrays.toString(dp));
        
        pw.println(str.toString());
        
        pw.close();
    }
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static <T> void deb(T x){
       System.out.println(x);
   }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String next(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
	    
	}
   
}