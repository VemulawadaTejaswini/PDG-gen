
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String b = scanner.next();
		if ("A".equals(b) || "T".equals(b)) {
			System.out.println("A".equals(b) ? "T" : "A");
		}
		if ("C".equals(b) || "G".equals(b)) {
			System.out.println("C".equals(b) ? "G" : "C");
		}
		scanner.close();
	}
}