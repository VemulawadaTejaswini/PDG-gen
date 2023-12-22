import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		short a = sc.nextShort();
		short b = sc.nextShort();
		short c = sc.nextShort();
		short d = sc.nextShort();

		System.out.println(Math.max(a * b, c * d));
	}
}