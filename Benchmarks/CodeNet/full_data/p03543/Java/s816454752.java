import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char a = N.charAt(0);
		char b = N.charAt(1);
		char c = N.charAt(2);
		char d = N.charAt(3);
		
		if ((a == b && b == c) || (b == c && c == d)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
