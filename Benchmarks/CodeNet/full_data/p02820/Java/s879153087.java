import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int R = in.nextInt();
		int S = in.nextInt();
		int P = in.nextInt();
		char[] c = in.next().toCharArray();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			if (c[i] == 'r') {
				if ((i - K) >= 0 && c[i] == c[i - K]) {
					c[i] = '0';
				} else {
					ans += P;
				}
			} else if (c[i] == 's') {
				if ((i - K) >= 0 && c[i] == c[i - K]) {
					c[i] = '0';
				} else {
					ans += R;
				}
			} else if (c[i] == 'p') {
				if ((i - K) >= 0 && c[i] == c[i - K]) {
					c[i] = '0';
				} else {
					ans += S;
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}