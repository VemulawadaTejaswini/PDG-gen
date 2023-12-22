import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		String S = in.next();
		char small = Character.toLowerCase(S.charAt(K-1));
		System.out.println(S.substring(0,K-1)+small+S.substring(K));
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}