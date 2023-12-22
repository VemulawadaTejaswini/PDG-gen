import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sh = s.split(" ");
		int n = Integer.parseInt(sh[0]);
		int x = Integer.parseInt(sh[1]);

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(sc.next());
			list.add(m);
			x -= m;
		}
		Collections.sort(list);

		System.out.println(n + (int) (x / list.get(0)));

		sc.close();
	}
}