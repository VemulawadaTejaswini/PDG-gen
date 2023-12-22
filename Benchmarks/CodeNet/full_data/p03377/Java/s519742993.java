import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		if (a < x) {
			System.out.println("NO");

		} else if ((a + b) >= x) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
