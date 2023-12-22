import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final List<String> LIST = Arrays.asList("AAA", "BBB");

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(LIST.contains(scanner.next()) ? "No" : "Yes");
		}
	}
}
