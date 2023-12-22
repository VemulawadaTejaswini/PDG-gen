import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		solve(a, b);

	}

	static void solve(int a, int b) {

		switch (a) {
		case 0:
			System.out.println(b);
			break;
		case 1:
			System.out.println(100 * b);
			break;
		case 2:
			System.out.println(10000 * b);
			break;
		default:
			break;
		}
	}
}