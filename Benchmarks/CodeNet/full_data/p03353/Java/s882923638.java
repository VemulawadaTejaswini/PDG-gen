import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int K = scanner.nextInt();
		TreeSet<String> strings = new TreeSet<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				strings.add(s.substring(i, j));
			}
		}
		int i = 0;
		String result = null;
		for (String string : strings) {
			if (++i == K) {
				result = string;
				break;
			}
		}
		System.out.println(result);
	}

}