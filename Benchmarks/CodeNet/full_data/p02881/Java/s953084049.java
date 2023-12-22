import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = Long.parseLong(sc.next());

		sc.close();

		for (long i = (long) Math.sqrt(N); i >= 1; i--) {
			if (N % i == 0) {
//				System.out.println(i);
//				System.out.println(N / i);
				System.out.println(i - 1 + N / i - 1);
				break;
			}
		}

	}
}
