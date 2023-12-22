import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String c;
		String ans = "";

		List<String> lists = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
				"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

		c = scanner.next();

		for (int i = 0; i < lists.size(); i++) {

			if (c.equals(lists.get(i))) {
				ans = lists.get(i + 1);
			}
		}

		System.out.println(ans);

	}

}