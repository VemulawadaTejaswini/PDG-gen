import java.util.Scanner;

public class Main {
	
	private static int[] input = new int[10010];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i , n , k , ans = 0;
		n = scan.nextInt();
		k = scan.nextInt();
		
		for (i = 0;i < n;i ++) {
			input[i] = scan.nextInt();
		}
		
		for (i = 0;i < n;i ++) {
			// 如果是必要的
			if (!check(i , n , input[i] , k)) {
				ans ++;
			}
		}
		System.out.println(ans);
		
	}
	
	private static boolean[] dp;
	
	// 除了index以外的所有元素是否能够得到[k - value -> k - 1]
	private static boolean check(int index , int n , int value , int k) {
		
		int i , j;
		dp = new boolean[k + 1];
		dp[0] = true;
		for (i = 0;i < n;i ++) {
			if (i != index) {
				int v = input[i];
				for (j = k;j >= v;j --) {
					if (dp[j - v]) {
						dp[j] = true;
					}
				}
			}
		}
		for (i = Math.max(k - value , 0);i <= k - 1;i ++) {
			if (dp[i])
				return true;
		}
		return false;
		
	}
	
	
}




