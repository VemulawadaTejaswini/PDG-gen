import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		final int L = Integer.parseInt(sc.next());
		final int NL = N + L -1;
		int ans = 0;
		if (L <= 0 && L + N > 0 ) {
			for(int i = 0; i < N; i++) {
				ans += i + L;
			}
		} else if(L <= 0) {
			ans = (L * -1 * (L * -1 + 1) - NL * -1 * (NL * -1 + 1)) / 2;
		} else {
			ans = (NL * (NL + 1) - L * (L + 1)) / -2;
		}
		System.out.println(ans);


	}

}
