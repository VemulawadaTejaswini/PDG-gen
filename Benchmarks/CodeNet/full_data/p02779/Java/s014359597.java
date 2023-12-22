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

		A.sort(null);

		for (int i = 0; i < N-1; i++) {
				if (A.get(i) == A.get(i+1)) {
					System.out.println("NO");
					return;
			}
		}

		System.out.println("YES");

		scanner.close();
	}

}
