import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		string = string.replaceAll(",", " ");
		System.out.println(string);
	}
}