import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[100010];
		for(int i = 0 ; i < 100010 ; i++) dp[i] = -1;
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		dp[0] = 0;
		while(!q.isEmpty()) {
			int v = q.poll();
			for(int i = 1 ; i + v <= n ; i *= 6) {
				if(dp[i + v] == -1) {
					dp[i + v] = dp[v] + 1;
					q.add(i + v);
				}
			}
			for(int i = 1 ; i + v <= n ; i *= 9) {
				if(dp[i + v] == -1) {
					dp[i + v] = dp[v] + 1;
					q.add(i + v);
				}
			}
		}
		System.out.println(dp[n]);
	}
}
