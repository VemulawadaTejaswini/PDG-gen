import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int abs_xa = Math.abs(x - a);
		int abs_xb = Math.abs(x - b);

		if (abs_xa < abs_xb) {
			System.out.print("A");

		} else {
			System.out.print("B");
		}
	}
}