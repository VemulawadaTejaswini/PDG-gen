import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long y = sc.nextLong();

		int count = 1;
		while (x * 2 <= y) {
			x *= 2;
			count++;
		}

		System.out.println(count);

		sc.close();
	}
}