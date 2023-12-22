import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		if (Math.abs(A - B - 1) % 2 == 1) {
			System.out.println(Math.abs((A - B) / 2));
		} else {
			System.out.println(Math.max(Math.max(Math.abs(N-A), Math.abs(N-B)), Math.max(A, B)) - 1);
		}

	}
}