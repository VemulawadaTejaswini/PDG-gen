import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			int all = 0;
			List<Integer> list = new ArrayList<>();
			list.add(a);
			list.add(b);
			list.add(c);

			Collections.sort(list);
			all += Math.abs(list.get(0) - list.get(1));
			all += Math.abs(list.get(1) - list.get(2));

			System.out.println(all);

		}
	}
}
