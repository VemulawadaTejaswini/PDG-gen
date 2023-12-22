import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
		    System.out.println(3);
		    return;
		}
		char[] arr1 = sc.next().toCharArray();
		char[] arr2 = sc.next().toCharArray();
		int[] types = new int[n];
		int idx = 0;
		int charIdx = 0;
		while (idx < n) {
		    if (arr1[charIdx] == arr2[charIdx]) {
		        types[idx] = 1;
		        charIdx++;
		        idx++;
		    } else {
		        types[idx] = 2;
		        types[idx + 1] = 3;
		        charIdx += 2;
		        idx += 2;
		    }
		}
		int[][][] dp = new int[3][3][n];
		dp[0][1][1] = 1;
		dp[0][2][1] = 1;
		dp[1][0][1] = 1;
		dp[1][2][1] = 1;
		dp[2][0][1] = 1;
		dp[2][1][1] = 1;
        for (int i = 2; i < n; i++) {
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    for (int c = 0; c < 3; c++) {
                        if (types[i] == 1) {
                            if (b == c || (types[i - 1] != 1 && a == c)) {
                                continue;
                            }
                        } else if (types[i] == 2) {
                            if ((types[i - 1] != 1 && a == c) || (types[i - 1] == 1 && b == c)) {
                                continue;
                            }
                        } else {
                            if (b == c || a == c) {
                                continue;
                            }
                        }
                        dp[b][c][i] += dp[a][b][i - 1];
                        dp[b][c][i] %= MOD;
                    }
                }
            }
        }
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total += dp[i][j][n - 1];
                total %= MOD;
            }
        }
        System.out.println(total);
   }
}


