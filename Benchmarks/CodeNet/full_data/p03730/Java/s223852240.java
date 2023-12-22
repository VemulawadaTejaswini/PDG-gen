import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < b; i++) {
			set.add((i * a) % b);
		}
		System.out.print(set.contains(c) ? "YES" : "NO");
	}
}