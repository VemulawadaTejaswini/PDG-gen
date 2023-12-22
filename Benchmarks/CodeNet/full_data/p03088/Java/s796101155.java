import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mod = (int) (1E9+7);
		
		//[A,G,C,T]->[0,1,2,3]と置き換える。
		//012が×
		//並び替えて、012になるのもダメなので、
		//102,021,0*12,01*2もだめ。
		
		//DPで０文字から文字数を増やしていく。
		//増やした際に、ダメか否か考えるのは下３桁を見れば良い。
		
		int dp[][][][] = new int[N+1][4][4][4];
		dp[0][3][3][3]=1;//影響ない初期値を考える。
		for(int len=0;len<N;len++) {
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					for(int k=0;k<4;k++) {
						//追加する文字a
						for(int a=0;a<4;a++) {
							if(j==0&k==1&a==2)continue;
							if(j==1&k==0&a==2)continue;
							if(j==0&k==2&a==1)continue;
							if(i==0&k==1&a==2)continue;
							if(i==0&j==1&a==2)continue;
							dp[len+1][j][k][a]+=dp[len][i][j][k];
							dp[len+1][j][k][a]%=mod;
						}
					}
				}
			}
		}
		
		long ans = 0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					ans += dp[N][i][j][k];
					ans %= mod;
				}
			}
		}
		System.out.println(ans);
	}
}
