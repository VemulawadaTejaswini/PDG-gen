import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		for(int i = 0; i < h; i++){
			String string = scanner.nextLine();
			System.out.println(string);
			System.out.println(string);
		}
	}
}