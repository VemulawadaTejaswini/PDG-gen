import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();

			if (0 <= a - b) {
				System.out.println("delicious");
			} else if (a - b + x < 0) {
				System.out.println("dangerous");
			} else {
				System.out.println("safe");
			}
		}
	}
}