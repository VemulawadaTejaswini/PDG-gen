import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Set<Integer> diameters = new HashSet<>();
			for (int i = 0; i < n; i++) {
				diameters.add(scanner.nextInt());
			}
			System.out.println(diameters.size());
		}
	}
}
