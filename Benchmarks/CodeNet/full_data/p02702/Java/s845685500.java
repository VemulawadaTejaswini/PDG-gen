import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[][] dp = new int[length + 1][2019];
		long count = 0;
		for (int i = 0; i < length; i++) {
		    int x = arr[i] - '0';
		    for (int j = 0; j < 2019; j++) {
		        dp[i + 1][(j * 10 + x) % 2019] += dp[i][j];
		    }
		    dp[i + 1][x]++;
		    count += dp[i + 1][0];
		}
		System.out.println(count);
	}
}

