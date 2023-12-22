import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int type = sc.nextInt();
		int need[] = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		boolean canUse[] = new boolean[10];
		for(int i = 0; i < type; i ++) {
			canUse[sc.nextInt()] = true;
		}
		int dp[][] = new int[num + 1][10];
		dp[0][0] = 0;
		for(int i = 1; i <= num; i ++) {
			dp[i][0] = -1;
			for(int j = 1; j < 10; j ++) {
				dp[i][j] = 0;
			}
		}
		for(int i = 1; i <= num; i ++) {
			for(int j = 1; j < 10; j ++) {
				if(i < need[j] || !canUse[j]) {
					continue;
				}else {
					int tmp[] = new int[10];
					for(int k = 0; k < 10; k ++) {
						tmp[k] = dp[i - need[j]][k];
					}
					if(tmp[0] == -1) {
						continue;
					}
					tmp[j] ++;
					tmp[0] ++;
					boolean replace = false;
					for(int k = 9; k > 0; k --) {
						if(tmp[k] > dp[i][k]) {
							replace = true;
							break;
						}else if (tmp[k] < dp[i][k]) {
							replace = false;
							break;
						}
					}
					if(tmp[0] > dp[i][0] || (replace && tmp[0] == dp[i][0])) {
						for(int k = 0; k < 10; k ++) {
							dp[i][k] = tmp[k];
						}
					}
				}
			}
		}
		for(int i = 9; i > 0; i --) {
			for(int j = 0; j < dp[num][i]; j ++) {
				System.out.print(i);
			}
		}
		System.out.println();
	}
}