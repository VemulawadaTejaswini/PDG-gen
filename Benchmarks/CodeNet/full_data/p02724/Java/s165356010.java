import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		long A = N / 500; // 500yen
		long B = (N - (500 * A)) / 5; // 5yen

		System.out.println(1000 * A + 5 * B);

	}
}
