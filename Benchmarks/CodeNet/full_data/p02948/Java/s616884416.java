import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			List<List<Integer>> jobs = new ArrayList<>(m);
			for(int i = 0 ; i < m ; i++) {
				jobs.add(new ArrayList<>());
			}
			int a;
			int b;
			for(int i = 0 ; i < n ; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				if(m < a) {
					continue;
				}
				List<Integer> vList = jobs.get(m - a);
				if(vList == null) {
					vList = new ArrayList<>();
				}
				vList.add(b);
			}

			long value = 0;
			PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
				return Integer.compare(o2, o1);
			});

			for(ListIterator<List<Integer>> ite = jobs.listIterator(jobs.size()) ; ite.hasPrevious() ;) {
				for(Integer v : ite.previous()) {
					q.add(v);
				}
				if(!q.isEmpty()) {
					value += q.poll();
				}
			}
			System.out.println(value);
		}
	}

}
