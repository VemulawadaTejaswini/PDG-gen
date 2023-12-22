import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int dist = Math.abs(B - A);

		if (dist % 2 == 0) {
			System.out.print("Alice");
		} else {
			System.out.print("Borys");
		}
	}
}
