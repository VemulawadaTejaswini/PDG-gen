
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] line_b = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int sum;
		int ans=0;

		for (int i = 0; i < line[0]; i++) {
			sum = 0;
			int[] line_a = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < line[1]; j++) {
				sum += line_a[j] * line_b[j];
			}
			if (sum > line[2] * -1) {
				ans++;
			}
		}

		System.out.println(ans);

	}
}
