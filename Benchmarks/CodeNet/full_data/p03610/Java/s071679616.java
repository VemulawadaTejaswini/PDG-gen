import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String result = "";

		for (int i = 0; i < s.length(); i += 2) {
			result += s.substring(i, i+1);
		}
		System.out.println(result);
	}

}