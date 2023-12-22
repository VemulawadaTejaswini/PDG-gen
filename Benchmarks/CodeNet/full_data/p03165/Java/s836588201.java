package EduDp;
import java.util.*;
public class lcs {
	public static int[][] dp;
	public static String b;
	public static String a;
	public static String findString(int r, int c, String st) {
		if(r < 0 || c < 0)return st;
		if(r == 0 && c == 0)return st;
		if(r == 0)return findString(r, c-1, st);
		if(c == 0)return findString(r-1, c, st);
		if(a.charAt(r-1) == b.charAt(c-1))return findString(r-1, c-1, a.charAt(r-1) + ""+st);
		if(dp[r-1][c] > dp[r][c-1])return findString(r-1, c, st);
		else return findString(r, c-1, st);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		b = sc.nextLine();
		a = sc.nextLine();
		int alen = a.length();
		int blen = b.length();
//		System.out.println(alen+" "+blen);
		dp = new int[alen+1][blen+1];
		
		for(int i = 0; i <= alen; i ++) {		
			for(int j = 0; j <= blen; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
					continue;
				}
				if(i + j == 0);
				else if(i == 0)dp[i][j] = dp[i][j-1];
				else if(j == 0)dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
//				System.out.println(a.charAt(i-1) +" "+b.charAt(j-1));
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}
			}
		}
//		for(int i = 0; i < alen+1; i++)System.out.println(Arrays.toString(dp[i]));
		System.out.println(findString(alen, blen, ""));
	}
}
