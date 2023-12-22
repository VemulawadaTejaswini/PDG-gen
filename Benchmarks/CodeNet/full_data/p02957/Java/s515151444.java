import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int c = Math.abs(b - a);
		if (c % 2 == 1) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println(Math.min(a, b) + c / 2);
		}
	}
}
