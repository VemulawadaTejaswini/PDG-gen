import java.util.*;
public class Main {

	private static int dp[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int p[][] = new int[n][3];
		dp=new int[n+1];
		for (int i=0; i< n;i++){
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
			p[i][2] = sc.nextInt();
		}
		int ans = 0;
		if (p[0][0] > p[0][1]) {
			if (p[0][0]>p[0][2]){
				dp[0]=0;
				ans=p[0][0];
			} else {
				dp[0]=2;
				ans=p[0][2];
			}
		} else {
			if (p[0][1]>p[0][2]){
				dp[0]=1;
				ans=p[0][1];
			} else {
				dp[0]=2;
				ans=p[0][2];
			}
		}
		for (int i=1; i< n;i++){
			ans = ans + getmax(p[i],dp[i-1]);
		}
		System.out.println(ans);
	}
	private static int getmax(int p[],int i) {
		if (i==0){
			if (p[1]>p[2]){
				dp[i]=1;
				return p[1];
			}else{
				dp[i]=2;
				return p[2];
			}
		}
		if (i==1){
			if (p[0]>p[2]){
				dp[i]=0;
				return p[0];
			}else{
				dp[i]=2;
				return p[2];
			}
		}
		if (i==2){
			if (p[0]>p[1]){
				dp[i]=0;
				return p[0];
			}else{
				dp[i]=1;
				return p[1];
			}
		}
		return -1;
	}
}



