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

		List<Integer> p = new ArrayList<>();
		List<Integer> q = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		int[] s = new int[x + y + c];

		for (int i = 0; i < a; i++) {
			p.add(sc.nextInt());
		}
		for (int i = 0; i < b; i++) {
			q.add(sc.nextInt());
		}
		for (int i = 0; i < c; i++) {
			r.add(sc.nextInt());
		}

		p.sort(Collections.reverseOrder());
		p = p.subList(0, Math.min(x,a) );
		q.sort(Collections.reverseOrder());
		q = q.subList(0, Math.min(y,b) );

		r.addAll(p);
		r.addAll(q);
		r.sort(Collections.reverseOrder());

		long sum = 0;
		for (int i = 0; i < x+y; i++) {
			sum += r.get(i);
		}
		System.out.println(sum);
	}

}
