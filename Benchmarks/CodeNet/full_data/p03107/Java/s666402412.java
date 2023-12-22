import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int beforeCount = input.length();
		int previousCount = 0;
		do {
			previousCount = input.length();
			input = input.replaceAll("01", "");
			input = input.replaceAll("10", "");
		}while (input.length()!=previousCount);
		System.out.println(beforeCount-input.length());
		sc.close();
	}
}