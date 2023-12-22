import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		String black = "#";
		String white = ".";
		int ans = 0;

		for (int i = 1; i < s.length(); i ++) {
			if (String.valueOf(s.charAt(i)).equals(white)) {
				count++;
			}
			ans = Math.min(count, n - count);
		}
		System.out.println(ans);

	}
}
