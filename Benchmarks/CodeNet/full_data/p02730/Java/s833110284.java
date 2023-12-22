import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int N = s.length();
		int START = N/2;
		if (Palindrome(s)&&Palindrome(s.substring(0,START))&&Palindrome(s.substring(START+1))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	public static boolean Palindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
}