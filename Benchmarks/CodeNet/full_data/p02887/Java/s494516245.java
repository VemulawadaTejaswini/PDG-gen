
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			int result = 0;
			char tmp = ' ';

			for (char c : s.toCharArray()) {
				if (tmp != c) {
					result++;
				}
				tmp = c;
			}
			System.out.println(result);
		}
	}
}
