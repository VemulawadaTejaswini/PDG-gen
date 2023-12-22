import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		long K = in.nextLong();
		int ans = 1;
		for (int i = 0; i < Math.min(S.length(), K); i++) {
			if (S.charAt(i) >= '2') {
				ans = S.charAt(i) - '0';
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
}