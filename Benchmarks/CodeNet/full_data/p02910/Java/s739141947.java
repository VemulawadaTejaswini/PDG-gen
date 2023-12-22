import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		for (int i = 0; i < s.length; i++) {
			int key = i % 2;
			if (key == 0) {
				if (s[i] == 'L') {
					System.out.println("No");
					return;
				}
			} else {
				if (s[i] == 'R') {
					System.out.println("No");
					return;
				}

			}
		}
		System.out.println("Yes");
	}
}