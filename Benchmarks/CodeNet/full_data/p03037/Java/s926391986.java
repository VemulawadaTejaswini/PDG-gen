import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			l.add(sc.nextInt());
			r.add(sc.nextInt());
		}
		int min = Collections.max(l);
		int max = Collections.min(r);
		System.out.println(Math.min(max - min + 1, n));
	}
}
