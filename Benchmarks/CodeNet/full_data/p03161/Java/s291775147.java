import java.util.*;
public class Main {
	private static int h[];
	private static int dp[];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        h = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
        	h[i] = sc.nextInt();
        }

		// 40 10 20 70 80 10 20 70 80 60
		dp[0] = 0;
		for (int i=1; i < n; i++) {
			for (int j=1;j <k+1;j++){
				if (i>=j) {
					int wk =bbbb(i,j);
                    if (j==1){
                    	dp[i]=wk;
                    } else {
						dp[i]=Math.min(dp[i],wk);
                    }
				}
			}
		}
		System.out.println(dp[n-1]);
	}
	private static int bbbb(int i, int j) {
		int b = Math.abs(h[i] - h[i-j]); //     i-2 j-1
		return dp[i-j] + b;
    }
}


