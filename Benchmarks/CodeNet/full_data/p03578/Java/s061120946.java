import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		List<Integer> d = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			d.add(sc.nextInt());
		}
		int m = sc.nextInt();
		List<Integer> t = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			t.add(sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			if (!d.remove(t.get(i))) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}