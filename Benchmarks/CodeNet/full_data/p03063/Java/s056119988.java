import java.util.*;
import java.io.*;

public class Main {
    static char[] stones;
    static int[][] dp;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stones = br.readLine().toCharArray();
		dp = new int[2][n];
		for (int[] arr : dp) {
		    Arrays.fill(arr, -1);
		}
		System.out.println(Math.min(dfw(0, n - 1), dfw(1, n - 1)));
	}
	
	static int dfw(int isBlack, int idx) {
	    if (idx < 0) {
	        return 0;
	    }
	    if (dp[isBlack][idx] >= 0) {
	        return dp[isBlack][idx];
	    }
	    int ans;
	    if (isBlack == 0) {
	        ans = dfw(isBlack, idx - 1);
	        if (stones[idx] == '#') {
	             ans++;
	        }
	    } else {
	        if (stones[idx] == '#') {
	            ans = dfw(isBlack, idx - 1);
	        } else {
	            ans = Math.min(dfw(isBlack, idx - 1) + 1, dfw(0, idx - 1));
	        }
	    }
	    return dp[isBlack][idx] = ans;
	}
}
