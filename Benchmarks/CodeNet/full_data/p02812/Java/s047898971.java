import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextInt();
			String s = scanner.next();
			int count = 0;
			int start = 0, index;
			while ((index = s.indexOf("ABC", start)) >= 0) {
				count++;
				start = index + 1;
			}
			System.out.println(count);
		}
	}
}
