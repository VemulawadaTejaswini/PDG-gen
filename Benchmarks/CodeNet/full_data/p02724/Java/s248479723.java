import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		int x500 = x / 500;
		int x5 = (x % 500) / 5;

		System.out.print(x500 * 1000L + x5 * 5);
	}
}
