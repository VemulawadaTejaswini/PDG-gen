import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		sc.close();
		int a = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				if (c[i] == 'L') {
					a++;
				}
			} else {
				if (c[i] == 'R') {
					a++;
				}
			}
		}
		if (a == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
