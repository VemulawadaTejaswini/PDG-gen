
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no3();
	}

	static void no3() {
		try (Scanner sc = new Scanner(System.in)) {
			Integer N = sc.nextInt();
			Integer M = sc.nextInt();

			long once = (M * 1900) + 100 * (N - M);
			double percent = Math.pow(0.5, M);

			long time = (long) (once / percent);
			System.out.println(time);
		}
	}
}