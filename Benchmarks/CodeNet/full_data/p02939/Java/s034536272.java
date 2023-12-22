import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char arr[] = s.toCharArray();
		int N = arr.length;
		if(N == 1){
			System.out.println(1);
			return ;
		}
		System.err.println(N);
		int dp[][] = new int[N][2];
		dp[0][0] = 1;
		dp[1][1] = 1;
		for(int i = 1; i < N ; ++i){
			// i番目の1文字のみ利用する場合
			int ret = 0;
			if(arr[i - 1] != arr[i]){
				ret = dp[i - 1][0] + 1;				
			}
			if(i >= 2){
				ret = Math.max(ret, dp[i - 2][1] + 1);
			}
			dp[i][0] = ret;
			if(i < N -1){
				ret = dp[i - 1][0] + 1;
				dp[i][1] = ret;
			}
		}
		int ret = Math.max(dp[N - 1][0], dp[N - 2][1]);
		System.out.println(ret);
//		System.out.println(Arrays.deepToString(dp));
	}
}
