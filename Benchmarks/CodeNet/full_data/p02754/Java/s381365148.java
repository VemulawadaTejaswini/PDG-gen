import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();

		if (A == 0) {
			System.out.println(0);
		} else {
			long count = N / (A+B);
			if (N % (A+B) < A) {
				System.out.println(A*count + N % (A+B));
			} else {
				System.out.println(A*count + A);

			}
		}
	}

}