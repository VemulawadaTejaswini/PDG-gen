import java.util.*;
public class Meme {
	static int val[];
	static int weight[];
	static int dp[][];
	static int l = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		val = new int[n];
		weight = new int[n];
		dp = new int[1000][n];
		for(int i = 0;i<n;i++){
			weight[i] = sc.nextInt();
			val[i] = sc.nextInt();
		}
		for(int i = 0;i<1000;i++){
			for(int j = 0;j<n;j++){
				dp[i][j]=-1;
			}
		}
		System.out.println(rec(0, 0, w));
	}
	public static int rec(int i, int v, int w){
		if(w<0)
			return 0;
		if(i>=val.length)
			return v;
		if(dp[v][i]!=-1){
			return dp[v][i];
		}
		return dp[v][i] = (int) Math.max(rec(i+1, v+val[i], w-weight[i]), rec(i+1, v, w));
	}
}
