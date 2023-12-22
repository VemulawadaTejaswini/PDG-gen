import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		List<Long> p = new ArrayList<>();
		List<Long> q = new ArrayList<>();
		List<Long> r = new ArrayList<>();
		int[] s = new int[x + y + c];

		for (int i = 0; i < a; i++) {
			p.add(sc.nextLong());
		}
		for (int i = 0; i < b; i++) {
			q.add(sc.nextLong());
		}
		for (int i = 0; i < c; i++) {
			r.add(sc.nextLong());
		}

		p.sort(Collections.reverseOrder());
		p = p.subList(0, x);
		q.sort(Collections.reverseOrder());
		q = q.subList(0, y);

		r.sort(Collections.reverseOrder());

		int pi = 0;
		int qi = 0;
		int ri = 0;

		long sum = 0;
		for (int i = 0; i < x; i++) {
			if (ri == r.size() || p.get(pi) > r.get(ri)) {
				sum += p.get(pi++);
			} else {
				sum += r.get(ri++);
			}
		}
		for (int i = 0; i < y; i++) {
			if (ri == r.size() || q.get(qi) > r.get(ri)) {
				sum += q.get(qi++);
			} else {
				sum += r.get(ri++);
			}
		}		
		
		System.out.println(sum);
	}

}