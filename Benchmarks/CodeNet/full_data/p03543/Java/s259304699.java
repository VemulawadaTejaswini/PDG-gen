import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = String.valueOf(n);
		char[] c = new char[4];
		c[0] = s.charAt(0);
		c[1] = s.charAt(1);
		c[2] = s.charAt(2);
		c[3] = s.charAt(3);
		if (c[0] == c[1] && c[1] == c[2] || c[1] == c[2] && c[2] == c[3]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
