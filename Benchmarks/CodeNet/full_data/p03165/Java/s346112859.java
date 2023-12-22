import java.util.*;

class Main {
	public static String dfs(String a, String b, String[][] dp, int pa, int pb) {
		if(pa == a.length() || pb == b.length()) return "";

		if(dp[pa][pb] == null) {
			if(a.charAt(pa) == b.charAt(pb)) {
				dp[pa][pb] = a.charAt(pa) + dfs(a, b, dp, pa+1, pb+1);
			} else {
				String i = dfs(a, b, dp, pa+1, pb);
				String j = dfs(a, b, dp, pa, pb+1);

				if(i.length() > j.length())
					dp[pa][pb] = i;
				else dp[pa][pb] = j;
			}
		}

		return dp[pa][pb];
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	String a = sc.nextLine();
    	String b = sc.nextLine();
    	String[][] dp = new String[a.length()][b.length()];

    	System.out.println(dfs(a, b, dp, 0, 0));
    }
}