import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < 26; i++) {
			int a = n - 4 * i;
			if (a >= 0 && a % 7 == 0) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
