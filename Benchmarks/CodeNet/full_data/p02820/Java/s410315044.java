import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		long ans = 0;
		Main main = new Main();
		char pastHand = ' ';

		for (int i = 0; i < K; i++) {
			for (int j = i; j < N; j=j+K) {
				char hand = T.charAt(j);
				int let = main.DP(hand, pastHand, R, S, P);
				if (let == 0) {
					pastHand = ' ';
				}else {
					pastHand = hand;
				}
				ans += let;
			}
			pastHand = ' ';
		}

		System.out.println(ans);

	}

	public int DP(char hand,char pastHand,int r,int s,int p) {
		if (hand == pastHand) {
			return 0;
		}
		if (hand == 'r') {
			return p;
		}
		if (hand == 's') {
			return r;
		}
		if (hand == 'p') {
			return s;
		}
		return 0;
	}
}