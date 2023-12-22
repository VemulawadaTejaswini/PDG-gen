import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int[] bl = new int[N+1];
		for(int i = 1; i <= N; i++) {
			bl[i] = bl[i-1];
			if(S[i-1] == '#')
				bl[i]++;
		}
		int ans = Math.min(N - bl[N], bl[N]);
		for(int i = 1; i <= N; i++) {
			int black = bl[N]-bl[i];
			int white = N-bl[N]-(i-bl[i]);
			if(black > white) {
				ans = Math.min(ans, bl[i] + white);
				break;
			}
		}
		System.out.println(ans);

	}

}
