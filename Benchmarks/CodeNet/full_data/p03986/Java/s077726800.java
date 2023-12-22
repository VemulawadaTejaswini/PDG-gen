import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		for (int i = 0; i < 100; i++) {
			x = x.replaceAll("ST", "");
		}
		System.out.println(x.length());
	}
}