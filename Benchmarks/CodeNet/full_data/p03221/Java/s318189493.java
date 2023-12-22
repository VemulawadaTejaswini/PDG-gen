import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static class Point {
		public Point(int p, int y) {
			this.p = p;
			this.y = y;
		}

		int p, y;
	}

	private static int N;
	private static int M;
	private static HashMap<Integer, SortedMap<Integer, Integer>> tmpMap = new HashMap<>();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		List<Point> list = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Point(p, y));
			SortedMap<Integer, Integer> treemap;
			if (tmpMap.containsKey(p)) {
				treemap = tmpMap.get(p);
			} else {
				treemap = new TreeMap<>();
			}
			treemap.put(y, 0);
			tmpMap.put(p, treemap);
		}

		for (Entry<Integer, SortedMap<Integer, Integer>> item : tmpMap.entrySet()) {
			int i = 0;
			Iterator<Entry<Integer, Integer>> iterator = item.getValue().entrySet().iterator();
			while (iterator.hasNext()) {
				iterator.next().setValue(++i);
			}
		}
		for (Point point : list) {
			int p = point.p;
			String string1 = "000000" + p;
			String string2 = "000000" + tmpMap.get(p).get(point.y);
			System.out.println(string1.substring(string1.length() - 6) + string2.substring(string2.length() - 6));
		}
	}
}
