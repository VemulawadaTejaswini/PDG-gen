import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int n, k, INF = (int)1e9;
	static int[] h, memo;
	
	public static int dp(int i) {
		if(i == n - 1)
			return 0;
		if(memo[i] != -1)
			return memo[i];
		
		int min = INF;
		for(int j = i + 1; j < Math.min(n, i + k + 1); j++)
			min = Math.min(min, Math.abs(h[i] - h[j]) + dp(j));
		return memo[i] = min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		
		h = new int[n];
		for(int i = 0; i < n; i++)
			h[i] = sc.nextInt();
		
		memo = new int[n];
		Arrays.fill(memo, -1);
		System.out.println(dp(0));
	}
}
