import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] firstLine = scan.nextLine().split(" ");
		int k = Integer.valueOf(firstLine[0]);
		int x = Integer.valueOf(firstLine[1]);
		StringBuilder sb = new StringBuilder();

		int index = x - k;
		for (int i = k * 2 - 1; i > 0; i--) {
			sb.append((index += 1) + " ");
		}
		if (!sb.toString().isEmpty()) {
			sb.deleteCharAt(sb.length() - 1);
		}
		System.out.println(sb.toString());
	}
}
