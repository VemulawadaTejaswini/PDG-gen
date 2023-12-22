import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Set<Integer> s = new HashSet<>();

			for (int i = 1; i < 10; i++) {
				for (int j = i; j < 10; j++) {
					s.add(i * j);
				}
			}
			if (s.contains(n)) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		}
	}
}
