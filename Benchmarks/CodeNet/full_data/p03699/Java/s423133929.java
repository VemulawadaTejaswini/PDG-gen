import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x % 10  > 0) {
				score += x;
			}
		}
		System.out.println(score);
		sc.close();
	}
}
