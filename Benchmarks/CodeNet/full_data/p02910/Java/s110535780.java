import java.util.Scanner;

//AtCoder Beginner Contest 141
//B	Tap Dance
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (i % 2 == 0) {
				if (c != 'R' && c != 'U' && c != 'D') {
					System.out.println("No");
					return;
				}
			} else {
				if (c != 'L' && c != 'U' && c != 'D') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
