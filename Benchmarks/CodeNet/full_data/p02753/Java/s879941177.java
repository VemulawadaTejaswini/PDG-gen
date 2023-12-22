import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		s = s.replaceAll("A", "");
		
		if (s.length() == 0 || s.length() == 3) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}
}	