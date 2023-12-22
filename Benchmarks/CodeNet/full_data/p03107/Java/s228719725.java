import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			int oneCount = (int) s.chars().filter(x -> x == '1').count();
			int zeroCount = s.length() - oneCount;
			System.out.println(2 * Math.min(oneCount, zeroCount));
		}
	}
}
