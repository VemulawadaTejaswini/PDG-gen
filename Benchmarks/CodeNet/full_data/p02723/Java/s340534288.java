import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = (String) sc.nextLine();
		if (S.charAt(2) == S.charAt(3)) {
			if (S.charAt(4) == S.charAt(5)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}