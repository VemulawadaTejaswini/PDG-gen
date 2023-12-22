import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int countA = 0;
		int countB = 0;
		String black = "#";
		String white = ".";
		int ans = 0;

		for (int i = 1; i < s.length(); i ++) {
			if (String.valueOf(s.charAt(i)).equals(white)) {
				countA++;
				if (String.valueOf(s.charAt(i - 1)).equals(black)) {
					countB++;
				}
			}
		}
		if (countB != 0) {
			ans = Math.min(countA, n - countA);
		}
		System.out.println(ans);

	}
}
