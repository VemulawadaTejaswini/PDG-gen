import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[Integer.parseInt(scanner.nextLine().split(" ")[1])];

		for(int i = 0; i < strings.length; i++) {
			strings[i] = scanner.nextLine();
		}

		System.out.println(Arrays.stream(strings).sorted().collect(
				StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
	}
}