
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();
			long count = sc.nextLong();
			String s = sc.next();
			char min = 'z';
			for(char c : s.toCharArray()) {
				if (c < min) {
					min = c;
				}
			}


			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < length; i++) {
				sb.append(min);
			}
			System.out.println(sb.toString());
		}
	}
}
