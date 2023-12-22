
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = 1;
		int R = N;
		int ans = 0;
		for(int i = 0; i < M; i++) {
			int Li = sc.nextInt();
			int Ri = sc.nextInt();
			L = Math.max(L, Li);
			R = Math.min(R, Ri);
		}
		if(L <= R) {
			ans = R - L + 1;
		}
		System.out.println(ans);
	}

}
