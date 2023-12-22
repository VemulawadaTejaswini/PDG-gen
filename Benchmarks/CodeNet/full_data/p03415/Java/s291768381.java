import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String C1 = sc.next();
		String C2 = sc.next();
		String C3 = sc.next();

		System.out.println( C1.charAt(0) + C2.charAt(1) + C3.charAt(2) );
	}
}