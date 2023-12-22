import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
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
	
	private static long dp[];
	private static long util(int arr[],int start,int k,int end) {
		
		if(start >= end-1) return 0;
		
		if(dp[start] != 0) return dp[start];
		long ans = Long.MAX_VALUE;
		
		for(int j = 1;  j <= k;  j++  ) {
			
			if(start + j < end) {
				ans = Math.min(ans , Math.abs(arr[start] - arr[start + j]) + util(arr,start + j,k,end));
			}
		}
		return dp[start] = ans;
		
	}
	
	
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		dp = new long[n + 1];
		System.out.println(util(arr,0,k,n));
	
	}
	
  
	
}
