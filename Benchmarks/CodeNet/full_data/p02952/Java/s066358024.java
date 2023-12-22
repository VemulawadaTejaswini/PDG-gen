import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(IntStream.range(1, n + 1).filter(x -> Integer.toString(x).length() % 2 == 1).count());;
	}
}
