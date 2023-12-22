import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		int answer = Stream.of(sc.nextLine().split(" ", n))
				.map(s -> Integer.parseInt(s))
				.map(i -> getTimesDivBy2(i))
				.min(Comparator.naturalOrder())
				.get();

		System.out.println(answer);


	}

	private static int getTimesDivBy2(int num) {
		int divCount = 0;
		while (num % 2 == 0 ) {
			divCount++;
			num /= 2;
		}
		return divCount;
	}

}