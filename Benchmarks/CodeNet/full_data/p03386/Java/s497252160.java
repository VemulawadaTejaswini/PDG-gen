import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();

		Set<Integer> set = new TreeSet<>();
		for (int i = a; i < a + k && i <= b; i++) {
			set.add(i);
		}

		for (int i = b; i > b - k && i >= a; i--) {
			set.add(i);
		}

		for (int i : set) {
			System.out.println(i);
		}

		sc.close();
	}
}
