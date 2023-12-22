import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		char[] chars = n.toCharArray();
		chars[0] = chars[0] == '1' ? '9' : '1';
		chars[1] = chars[1] == '1' ? '9' : '1';
		chars[2] = chars[2] == '1' ? '9' : '1';
		System.out.println(chars);
		scanner.close();
	}
}