import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextInt();

		if (a > b) {
			System.out.println("GREATER");
		} else if (a < b) {
			System.out.println("LESS");
		} else if (a == b) {
			System.out.println("EQUAL");
		}

	}

}