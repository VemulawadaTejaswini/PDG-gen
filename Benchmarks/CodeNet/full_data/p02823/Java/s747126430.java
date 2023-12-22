import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		if ((a - b) % 2 == 0) {
			System.out.println(Math.abs(a - b) / 2);
			return;
		}
		System.out.println(Math.max((a+b-1)/2,(2*n-a-b+1)/2));

	}

}
