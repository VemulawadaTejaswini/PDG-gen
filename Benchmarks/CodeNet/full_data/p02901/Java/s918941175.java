import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int key[][] = new int[M][2];
		for(int i=0;i<M;i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int s = 0;
			for(int j=0;j<b;j++) {
				int c = sc.nextInt()-1;
				s |= 1<<c ;
			}
			key[i][0]=s; //開けれる宝箱の番号が1で表現された01フラグ
			key[i][1]=a; //鍵の値段
		}
		sc.close();
		
		int dp[] = new int[1<<N]; //開けれる宝箱の状態を、要素番号の二進数表記の１で表現したときの、最小コスト
		int INF = Integer.MAX_VALUE/2;
		Arrays.fill(dp, INF);
		dp[0]=0;
		for(int i=0;i<(1<<N);i++) {
			for(int j=0;j<M;j++) {
				int keyOpenNum = key[j][0];
				int keyCost = key[j][1];
				int nextOpenNum = i|keyOpenNum;
				dp[nextOpenNum]= Math.min(dp[nextOpenNum], dp[i]+keyCost);
			}
		}
		
		int ans = (dp[(1<<N) -1]==INF)? -1:dp[(1<<N) -1];
		System.out.println(ans);
	}
}
