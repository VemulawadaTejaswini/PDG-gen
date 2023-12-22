import java.util.*;

public class Main{
	
	static final int r = 1000000007;
	static long dp[][];
	
	public static long solve(int p, int j, String s){
		long ans = 0;
		String abc = "ABC";
		if(dp[p][j] != 0)return dp[p][j];
		if(p == s.length()){
			if(j < 3)return dp[p][j] = 0 % r;
			return dp[p][j] = 1 % r;
		}	
		long m1 = 1, m2 = 0;
		if(s.charAt(p) == '?')m1 = 3;
		if(j == 3)
			return dp[p][j] = (m1 * solve(p + 1, j, s)) % r;
		if(m1 == 3)m2 = 1;
		else if(s.charAt(p) == abc.charAt(j))m2 = 1;
		return dp[p][j] = ((m1 * solve(p + 1, j, s))% r) + ((m2 * solve(p + 1, j + 1, s)) % r);
	}	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		dp = new long[s.length() + 1][4];
		sc.close();
		long ans = solve(0, 0, s);	
		System.out.println(ans);
	}
}