import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String ans = "Three";

		for (int i = 0; i < n; i++) {
			String m = sc.next();
			if (m.equals("Y")) {
				ans = "Four";
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
