import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}

		Iterator<Integer> it = a.iterator();
		int total = 0;
		int index = 1;
		while (it.hasNext()) {

			int i = it.next();
			if (i == index) {
				index++;
			} else {
				total++;
			}
		}
		if (total == n) {
			System.out.println(-1);
		} else {
			System.out.println(total);
		}

	}

}
