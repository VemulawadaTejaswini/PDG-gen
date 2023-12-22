import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<V> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new V(sc.nextDouble(), sc.nextDouble()));
		}
		List<Integer> elements = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			elements.add(i);
		}

		List<List<Integer>> temp = m(elements);
		double sum = 0;
		for (List<Integer> a : temp) {
			Double sumtemp = 0D;
			V before = list.get(a.get(0));
			for (int i = 1; i < n; i++) {
				V now = list.get(a.get(i));
				sumtemp += before.distance(now);
				before = now;
			}
			sum += sumtemp;
		}
		System.out.println(sum / factorial(n));

//		sc.close();
	}

	private static Map<Integer, Integer> map = new HashMap<>();

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		if (!map.containsKey(n - 1)) {
			map.put(n - 1, factorial(n - 1));
		}
		return n * map.get(n - 1);
	}

	private static List<List<Integer>> m(List<Integer> elements) {
		int n = elements.size();
		List<List<Integer>> list = new ArrayList<>();
		if (n == 1) {
			List<Integer> l = new ArrayList<>();
			l.add(elements.get(0));
			list.add(l);
			return list;
		}
		for (int i = 0; i < n; i++) {
			int element = elements.remove(i);
			List<List<Integer>> li = m(elements);
			for (List<Integer> temp : li) {
				List<Integer> l = new ArrayList<>();
				l.add(element);
				l.addAll(temp);
				list.add(l);
			}
			elements.add(i, element);
		}
		return list;
	}

	private static class V {
		public double x;
		public double y;

		public V(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		public double distance(V v) {
			return Math.sqrt(Math.pow(this.x - v.x, 2) + Math.pow(this.y - v.y, 2));
		}
	}
}
