import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int ans = 0;
		int b = N/K;
		ans += b*b*b;
		if(K%2==0) {
			int c = K/2;
			int d = (N+c)/K + 1;
			ans += d*d*d;
		}
		System.out.println(ans);
		scn.close();
	}
}
