import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		for (int i = 0; i < S.length()-1; i++) {
			char c = S.charAt(i);
			char c2 = S.charAt(i+1);
			if (c == c2) {
				System.err.println("Bad");
				return;
			}
 		}
		System.out.println("Good");
	}
}
