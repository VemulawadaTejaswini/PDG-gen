
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			if ("Sunny".equals(s)) {
				System.out.println("Cloudy");
			} else if ("Cloudy".equals(s)) {
				System.out.println("Rainy");
			} else {
				System.out.println("Sunny");

			}
		}
	}
}
