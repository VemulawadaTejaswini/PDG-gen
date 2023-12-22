import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long A = in.nextLong();
		long B = in.nextLong();
		if ((B - A) % 2 == 0) {
			System.out.println((long) (B - A) / 2);
		} else {
			if ((A - 1) <= (N - B)) {
				System.out.println(B - 1);
			} else {
				System.out.println(N - A);
			}
		}
		in.close();
	}
}