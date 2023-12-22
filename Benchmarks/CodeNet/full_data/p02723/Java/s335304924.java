

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if (s.substring(2, 3).equals(s.substring(3, 4)) && s.substring(4, 5).equals(s.substring(5, 6))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
