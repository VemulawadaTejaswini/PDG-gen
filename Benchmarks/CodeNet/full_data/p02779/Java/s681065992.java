import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		String string = scanner.nextLine();

		string = scanner.nextLine();

		List<Integer> A = Arrays.stream(string.split(" "))
				.map(val -> Integer.parseInt(val))
				.collect(Collectors.toList());

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (A.get(i) == A.get(j)) {
					System.out.println("NO");
					return;
				}
			}
		}

		System.out.println("YES");

		scanner.close();
	}

}
