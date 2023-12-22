import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		a += sc.nextInt();
		a += sc.nextInt();

		if (a > 21) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
	}
}
