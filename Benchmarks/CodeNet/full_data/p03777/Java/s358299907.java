import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();

		if (a.equals("H")) {
			if (b.equals("H")) {
				System.out.println("H");
			} else {
				System.out.println("D");
			}
		} else {
			if (b.equals("H")) {
				System.out.println("D");
			} else {
				System.out.println("H");
			}
		}
	}

}
