import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		boolean check = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '7') {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}