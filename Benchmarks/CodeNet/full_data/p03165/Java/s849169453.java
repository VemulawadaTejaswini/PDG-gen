import java.util.*

public class Main{

	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Lcs(s.toCharArray(),t.toCharArray());
    }
    
		public static void Lcs(char[] s, char[] t) {
			int[][] dp = new int[s.length+1][t.length+1];	
			 helper(s,t,dp,s.length,t.length);
			 StringBuilder sb = new StringBuilder("");
			 dfs(dp,s,t,s.length,t.length,sb);
			 System.out.println(sb);
		}
	
		private static void dfs(int[][] dp, char[] s, char[] t, int i, int j,StringBuilder result) {
	
			if(i==0||j==0)return;
			if(s[i-1]==t[j-1]) {
				 dfs(dp,s,t,i-1,j-1,result);
				result.append(s[i-1]);
				return;
			}
			if(dp[i-1][j]==dp[i][j]) {
				 dfs(dp,s,t,i-1,j,result);
				 return;
			}else {
				dfs(dp,s,t,i,j-1,result);
				return;
			}
		}
	
		private static int helper(char[] s, char[] t, int[][] dp, int i, int j) {
			
			if(i==0 || j==0) {
				return 0;
			}
			if(dp[i][j]!=0) {
				return dp[i][j];
			}
			
			if(s[i-1]==t[j-1]) {
				dp[i][j]=  1+ helper(s,t,dp,i-1,j-1);
	
			}
			else {
				dp[i][j]= Math.max(helper(s,t,dp,i-1,j), helper(s,t,dp,i,j-1));
			}
			return dp[i][j];
			
		}

}
