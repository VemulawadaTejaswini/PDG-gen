import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				Arrays.stream(scanner.nextLine().split(" ")).sorted().collect(Collectors.toList()).equals(Arrays.asList("5", "5", "7")) ?
					"YES" : "NO");
	}
}