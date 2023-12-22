import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			List<Integer> integers = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				integers.add(scanner.nextInt());
			}

			System.out.println(Collections.max(integers) - Collections.min(integers));
		}
	}
}