import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println(0);
		} else if (a >= b && a >= c) {
			System.out.println(b * c);
		} else if (b >= a && b >= c) {
			System.out.println(a * c);
		} else if (c >= a && c >= b) {
			System.out.println(a * b);
		}
	}
}
