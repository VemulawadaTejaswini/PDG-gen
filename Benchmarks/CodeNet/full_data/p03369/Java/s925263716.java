import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'o') {
				count++;
			}
		}
		int ans = 700 + count * 100;
		System.out.println(ans);
	}

}
