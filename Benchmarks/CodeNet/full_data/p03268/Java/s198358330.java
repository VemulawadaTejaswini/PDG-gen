import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			int m = K - (i % K);
			if ((m * 2) % K == 0) {
				ans += ((N - m) / K + 1) * ((N - m) / K + 1);
			}
		}
		System.out.println(ans);
		scn.close();
	}
}
