import java.io.*;
import java.util.*;
public class Main
{
    static String str;
    static long[][][] dp;
    static int mod = 1000000007;
    static int d;
    public static long solve(int pos, int sum, int tight){
        if(pos == str.length()){
            if(sum%d == 0)
                return 1;
            return 0;
        }
        if(dp[pos][sum][tight] != -1){
            return dp[pos][sum][tight];
        }
        long ans = 0;
        int len = 9;
        if(tight == 1){
            len = str.charAt(pos)-'0';
        }
        for(int i = 0; i <= len; i++){
            int newt = 0;
            if(tight == 1 && i == len){
                newt = 1;
            }
            ans += solve(pos+1, (sum + i)%d, newt)%mod;
        }
        return dp[pos][sum][tight] = ans%mod;
    }
	public static void main(String[] args) throws Exception{
		FastReader s = new FastReader();
		StringBuilder sb = new StringBuilder("");
	    str = s.nextLine();
	    d = s.nextInt();
	    dp = new long[str.length()+1][d+1][2];
	    for(int i = 0; i < dp.length; i++){
	        for(int j = 0; j < dp[i].length; j++){
	            Arrays.fill(dp[i][j], -1);
	        }
	    }
	    long ans = solve(0, 0, 1);
	    ans--;
      	ans += mod;
      	ans %= ans;
	    sb.append(ans + "\n");
		System.out.print(sb);
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
