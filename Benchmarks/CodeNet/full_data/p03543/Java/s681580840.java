import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String n = scan.next();

		if (n.charAt(0) == n.charAt(1) && n.charAt(0) == n.charAt(2)) {
			System.out.println("Yes");
		} else if (n.charAt(3) == n.charAt(1) && n.charAt(3) == n.charAt(2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
