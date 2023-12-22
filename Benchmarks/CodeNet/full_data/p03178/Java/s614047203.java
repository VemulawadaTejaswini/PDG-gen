import java.util.*;
import java.io.*;

 class Main {
    static long global_mod = 1000000007;
    static long dp[][][];
   
   public static long solve2(String str, int pos, int mod, int d, int tight){
		if(pos >= str.length()){
			if(mod%d == 0)
				return 1;
			return 0;
		}
    
        if( dp[pos][mod][tight] != -1)
            return  dp[pos][mod][tight];
            
		long ans = 0;

		int allowed = tight == 1 ? str.charAt(pos)-'0' : 9;

		for(int i = 0; i <= allowed; i++){
			if(i == allowed && tight == 1)
				ans += solve2(str,pos+1, (mod +i )%d ,d ,1)%global_mod;


			else
				ans += solve2(str,pos+1,(mod  + i)%d,d,0)%global_mod;
		}

		return dp[pos][mod][tight] = ans%global_mod;

	}

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s = br.readLine().trim();
	    int d = Integer.parseInt(br.readLine().trim());
	    
	    dp = new long[s.length()+1][d+1][3];
	    
	    for(int i = 0; i < dp.length; i++){
	        for(int j = 0;j <= d; j++){
	            Arrays.fill(dp[i][j],-1l);
	        }
	    }
	    
		System.out.println((solve2(s,0,0,d,1)-1)%global_mod );
	}
}