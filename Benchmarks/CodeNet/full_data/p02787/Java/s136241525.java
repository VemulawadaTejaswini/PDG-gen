import java.util.*;

public class Main {
    static int[] dp;
    static Magic[] magics;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		magics = new Magic[n];
		for (int i = 0; i < n; i++) {
		    magics[i] = new Magic(sc.nextInt(), sc.nextInt());
		}
		dp = new int[h + 1];
		Arrays.fill(dp, -1);
		System.out.println(dfw(h));
	}
	
	static int dfw(int power) {
	    if (power <= 0) {
	        return 0;
	    }
	    if (dp[power] != -1) {
	        return dp[power];
	    }
	    dp[power] = Integer.MAX_VALUE;
	    for (int i = 0; i < magics.length; i++) {
	        dp[power] = Math.min(dp[power], dfw(power - magics[i].power) + magics[i].cost);
	    }
	    return dp[power];
	}
	
	static class Magic {
	    int power;
	    int cost;
	    
	    public Magic (int power, int cost) {
	        this.power = power;
	        this.cost = cost;
	    }
	}
}
