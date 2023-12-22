import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < S.length() - 2; i++) {
			int tmp = Integer.parseInt(S.substring(i, i + 3));
			ans = Math.min(ans, Math.abs(tmp - 753));
		}
		System.out.println(ans);

	}
}