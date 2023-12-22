import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] west = new int[N + 2];
		int[] east = new int[N + 2];
		String S = sc.next();
		for(int i = 0; i < N ; i++) {
			if(S.charAt(i) == 'W') west[i + 1]++;
			else east[i + 1]++;
		}
		for(int i = 1; i <= N; i++) {
			west[i] += west[i - 1];
			east[i] += east[i - 1];
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1; i <= N; i++) {
			ans = Math.min(ans, west[i - 1] + east[N] - east[i]);
		}
		System.out.println(ans);
	}
}