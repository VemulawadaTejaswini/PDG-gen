import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[][]dp;
	boolean[][]Map;//true なら 通行可能 false は 通行不可
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		int h = nextInt();
		int w = nextInt();
		Map=new boolean[h][w];
		dp=new int[h+1][w+1];
		int Mod = 1000_000_007;

		for(int i=0;i<h;i++) {
			char C[] = next().toCharArray();
			for(int j=0;j<w;j++)if(C[j]=='.')Map[i][j]=true;
		}

		dp[h-1][w-1]=1;//目的地
		//右端
		for(int i = h-2;0<=i;i--) {
			if(!Map[i][w-1])break;
			dp[i][w-1]=1;
		}
		//下端
		for(int i = w-2;0<=i;i--) {
			if(!Map[h-1][i])break;
			dp[h-1][i]=1;
		}
		//dp[0][0]~dp[h-2][w-2]の範囲
		for(int i=h-2;0<=i;i--) {
			for(int j=w-2;0<=j;j--) {
				if(Map[i][j])dp[i][j]=dp[i+1][j]+dp[i][j+1];
				if(dp[i][j]>=Mod)dp[i][j]-=Mod;
			}
		}

		System.out.println(dp[0][0]);
	}
	private int nextInt() {
		return Integer.parseInt(sc.next());
	}
	private String next() {
		return sc.next();
	}
}