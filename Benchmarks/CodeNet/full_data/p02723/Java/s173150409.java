import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();

		if (A.charAt(3) == A.charAt(4) && A.charAt(5) == A.charAt(6)) {

			System.out.print("Yes");

		} else {
			System.out.print("No");
		}
	}
}
