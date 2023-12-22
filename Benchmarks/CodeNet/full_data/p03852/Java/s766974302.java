import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		
		if (a.charAt(0) == 'a' || a.charAt(0) == 'i' || a.charAt(0) == 'u' || a.charAt(0) == 'e' || a.charAt(0) == 'o') {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}
}