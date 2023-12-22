import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final String KEYWORD = "AC";

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int q = scanner.nextInt();
			scanner.nextLine();
			String s = scanner.nextLine();
			List<Integer> result = new ArrayList<>();
			for (int i = 0; i < q; i++) {
				int l = scanner.nextInt();
				int r = scanner.nextInt();
				int count = 0;
				scanner.nextLine();
				String substring = s.substring(l - 1, r);
				char previous = ' ';
				for (char current : substring.toCharArray()) {
					if (('A' == previous) && ('C' == current)) {
						count++;
					}
					previous = current;
				}
				result.add(count);
			}
			result.stream().forEach(System.out::println);
		}
	}
}