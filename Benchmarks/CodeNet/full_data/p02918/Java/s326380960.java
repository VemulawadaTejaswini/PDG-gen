import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		int score = 0;

		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) score++;
		}

		int ans = Math.min(score + 2 * k, n - 1);
		System.out.println(ans);
	}
}
