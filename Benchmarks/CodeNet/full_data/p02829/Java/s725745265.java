import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		a = scan.nextInt();
		b = scan.nextInt();

		Set<Integer> sets = new HashSet<>();

		sets.add(1);
		sets.add(2);
		sets.add(3);

		sets.remove(a);
		sets.remove(b);

		sets.forEach(System.out::println);

	}

}