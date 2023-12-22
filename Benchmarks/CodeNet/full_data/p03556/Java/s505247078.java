
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();

			long tmp = 0;
			for (long i = 0; i * i <= n; i++) {
				tmp = i * i;
			}
			System.out.println(tmp);
		}
	}
}
