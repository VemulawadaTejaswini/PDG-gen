import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int l = str.length();
		do {
			l -= 1;
			str = str.substring(0, l);
		} while (!isOddString(str) && l > 0);
		System.out.println(l);
	}
	
	private static Boolean isOddString(String str) {
		int l = str.length() / 2;
		String a = str.substring(0, l);
		String b = str.substring(l, str.length());
		return (a.equals(b));
	}
}