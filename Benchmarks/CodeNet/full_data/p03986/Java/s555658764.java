import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		while (true) {
			if (s.contains("ST")) {
				s = s.replace("ST", "");
			} else {
				break;
			}
		}
		System.out.println(s.length());
	}
}