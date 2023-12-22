import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ans = 1;

		for (int a = 2; a < 32; a++) {

			for (int b = 2; b < 9; b++) {
				if ((int) Math.pow(a, b) <=num) {
					ans = Math.max(ans, (int) Math.pow(a, b));
				}
			}
		}
		System.out.println(ans);

	}
}
