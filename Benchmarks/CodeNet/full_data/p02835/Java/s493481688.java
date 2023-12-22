import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		int sum = a + b + c;

		if (sum >= 22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
	}
}