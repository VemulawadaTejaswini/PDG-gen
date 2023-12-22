import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(scanner.nextInt());
		}

		System.out.println(set.size());
	}
}
