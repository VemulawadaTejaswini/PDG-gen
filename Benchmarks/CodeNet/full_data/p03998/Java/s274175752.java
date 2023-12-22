import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s_a = in.nextLine();
		String s_b = in.nextLine();
		String s_c = in.nextLine();

		int a = 0;
		int b = 0;
		int c = 0;


		char currentChar = 'a';
		while (true) {
			if (currentChar == 'a') {
				if (a == s_a.length()) {
					System.out.println('A');
					break;
				}
				currentChar = s_a.charAt(a);
				a++;

			} else if(currentChar=='b') {
				if(b==s_b.length()) {
					System.out.println('B');
					break;
				}
				currentChar = s_b.charAt(b);
				b++;

			} else if(currentChar=='c') {
				if (c == s_c.length()) {
					System.out.println('C');
					break;
				}
				currentChar = s_c.charAt(c);
				c++;
							}
		}

	}
}
