import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		for (int i = 0; i < 3; i++) {
			if ( n.charAt(i) == '1') {
				System.out.print("9");
			} else if ( n.charAt(i) == '9' ) {
				System.out.print("1");
			}
		}
	}
}