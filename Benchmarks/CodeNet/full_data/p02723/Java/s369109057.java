

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s =scan.next();
		scan.close();

		char[] s_char =s.toCharArray();

		if(s_char[2]==s_char[3]&&s_char[4]==s_char[5])System.out.println("Yes");
		else System.out.println("No");
	}
}
