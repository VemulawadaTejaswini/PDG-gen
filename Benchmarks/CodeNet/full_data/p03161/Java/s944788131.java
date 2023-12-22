import java.util.Scanner;
 
class Main {
	int n;
	int k;
	int[] h;
	long[] dp;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		k = sc.nextInt();
		h = new int[n];
		dp = new long[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
			dp[i] = Long.MAX_VALUE;
		}
		dp[0] = 0;
	}
	void solve(){
		for(int i=1;i<n;i++){
			for(int j=1;j<=k&&(i-j)>=0;j++){
				dp[i] = Math.min(dp[i], dp[i-j]+Math.abs(h[i]-h[i-j]));
			}
		}
		System.out.println(dp[n-1]);
	}
}