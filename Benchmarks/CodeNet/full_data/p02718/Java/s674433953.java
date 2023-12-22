import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] line2 = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int sum = 0;

		for (int i = 0; i < line2.length; i++) {
			sum +=line2[i];
		}

		double lim = sum /(line[1] * 4);

		int ans = 0;
		for (int i : line2) {
			if (i >= lim) {
				ans++;
			}
		}

		if (ans >= line[1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}