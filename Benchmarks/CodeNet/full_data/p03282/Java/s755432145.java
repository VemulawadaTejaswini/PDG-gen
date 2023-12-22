import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		long K = sc.nextLong();

		int ans = -1;
		int cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			//System.out.println(S.charAt(i) - '0');
			if (S.charAt(i) - '0' == 1) {
				if (K == cnt) {
					System.out.println(S.charAt(i) - '0');
					return;
				} else {
					cnt++;
				}
			} else {
				System.out.println(S.charAt(i) - '0');
				return;
			}
		}
	}
}