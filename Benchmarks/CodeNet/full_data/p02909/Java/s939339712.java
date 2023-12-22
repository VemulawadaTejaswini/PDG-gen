import java.util.Scanner;

public class Main {

	private static final String[] WEATHERS = new String[] { "Sunny", "Cloudy", "Rainy" };

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println(WEATHERS[(getIndex(WEATHERS, s) + 1) % WEATHERS.length]);
		}
	}

	/**
	 * @param strings
	 * @param key
	 * @return keyがstringsにおけるindex
	 */
	private static int getIndex(String[] strings, String key) {
		for (int i = 0; i < strings.length; i++) {
			if (key.equals(strings[i])) {
				return i;
			}
		}
		return 0;
	}
}
