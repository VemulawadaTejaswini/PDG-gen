import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		List<Integer> a = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
		List<Integer> b = Arrays.asList(4, 6, 9, 11);
		List<Integer> c = Arrays.asList(2);

		if (a.contains(x) && a.contains(y) || b.contains(x) && b.contains(y) || c.contains(x) && c.contains(y)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}