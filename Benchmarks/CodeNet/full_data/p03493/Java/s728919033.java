import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String string = scanner.next();

		string = string.replaceAll("0", "");

		System.out.println(string.length());

		scanner.close();
	}

}
