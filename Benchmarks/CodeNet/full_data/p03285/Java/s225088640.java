import java.util.Scanner;
 
class Main {
	int n;
	boolean[] dp;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		dp = new boolean[n+1];
		dp[0] = true;
	}
	void solve(){
		for(int i=1;i<=n;i++){
			if(i-4>=0){
				dp[i] = dp[i-4]||dp[i];
			}
			if(i-7>=0){
				dp[i] = dp[i-7]||dp[i];
			}
		}
		if(dp[n]){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}