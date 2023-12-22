import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.nextLine();
		int k = sc.nextInt();
		String ans = "";

		String check = String.valueOf(s.charAt(k));

		for (int i = 0; i < s.length(); i++) {
			if (!String.valueOf(s.charAt(i)).equals(check)) {
				ans += "*";

			} else {
				ans += check;
			}
		}

		System.out.println(ans);
	}

}
