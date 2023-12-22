import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (Math.abs(A - B - 1) % 2 == 1) {
			System.out.println(Math.abs((A - B) / 2));
		} else {
			System.out.println(Math.max(Math.max(Math.abs(N-A), Math.abs(N-B)), Math.max(A, B)) - 1);
		}

	}
}