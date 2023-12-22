import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s;
		try (Scanner scanner = new Scanner(System.in)) {
			s = scanner.next();
		}

		boolean canObtain = s.replace("dreamer", "")
				.replace("eraser", "")
				.replace("dream", "")
				.replace("erase", "").isEmpty();

		System.out.println(canObtain);
	}
}