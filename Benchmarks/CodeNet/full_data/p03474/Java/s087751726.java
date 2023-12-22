
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();

		boolean ans = true;

		for (int i = 0; i < a; i++) {
			if(!Character.isDigit(s.charAt(i))) {
				ans = false;
			}
		}
		if(Character.isDigit(s.charAt(a))) {
			ans = false;
		}
		for (int i = a + 1; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				ans = false;
			}
		}

		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
