import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<Integer> x = new ArrayList<>();
		for (int i = 1; i <= M/2 + 1; i++) {
			if (M % i == 0) {
				x.add(i);
				x.add(M / i);
			}
		}
		TreeSet<Integer> t = new TreeSet<>(x);

		System.out.println(M/t.ceiling(N));

	}
}