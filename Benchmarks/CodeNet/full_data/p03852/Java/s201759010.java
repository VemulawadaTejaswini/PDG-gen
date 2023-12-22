import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char c = s.charAt(0);
		if (c == 'a' || c == 'b' || c == 'c' ||c == 'd' ||c == 'e') {			
			System.out.println("vowel");
		}
		else
		System.out.println("consonant");
	}
}
