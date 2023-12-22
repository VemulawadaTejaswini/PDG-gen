import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {

			int in = sc.nextInt();

			set.add(in);
		}

		System.out.println(set.size());


		sc.close();

	}
}