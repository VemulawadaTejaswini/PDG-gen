import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final long n = sc.nextInt();

		long result = (int) Math.sqrt(n);

		System.out.print(result * result);

	}

}