import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won = 0;
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				won++;
			}
		}
		if (won + (15 - str.length()) >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
