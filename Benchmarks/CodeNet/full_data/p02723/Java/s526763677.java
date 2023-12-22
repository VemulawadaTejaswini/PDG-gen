import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();
		char c3 = S.charAt(2);
		char c4 = S.charAt(3);
		char c5 = S.charAt(4);
		char c6 = S.charAt(5);

		if(c3 == c4 && c5 == c6) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
