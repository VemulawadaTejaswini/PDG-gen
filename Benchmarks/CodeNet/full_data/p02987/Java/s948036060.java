import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count = 0;
		int count2 = 0;

		for (int i = 0; i < 4; i++) {
			if (s.charAt(1) == s.charAt(i)) {
				count++;
			} else if (s.charAt(i) == s.charAt(i)) {
				count2++;
			}
		}

		if (count == 2 && count2 == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}