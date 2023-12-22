import java.util.*;

public class Main {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final String s = scanner.nextLine();

		String[] split = s.split(" ");

		if (split[1].equals("+")) {
			System.out.println(Integer.parseInt(split[0]) + Integer.parseInt(split[2]));
		} else {
			System.out.println(Integer.parseInt(split[0]) - Integer.parseInt(split[2]));
		}

		return;
	}
}