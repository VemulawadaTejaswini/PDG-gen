import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		char c3 = s.charAt(2);
		if (c1 == c2 && c2 == c3) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		sc.close();
	}

}
