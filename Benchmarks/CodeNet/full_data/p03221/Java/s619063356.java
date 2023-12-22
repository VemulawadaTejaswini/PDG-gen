
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	/**
	 * SortedMap
	 */
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		Map<Integer, SortedMap<Integer, Integer>> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			list.add(new Point(P, Y));
			SortedMap<Integer, Integer> treeMap;
			if (map.containsKey(P)) {
				treeMap = map.get(P);
			} else {
				treeMap = new TreeMap<Integer, Integer>();
			}
			treeMap.put(Y, 0);
			map.put(P, treeMap);
		}
		for (Entry<Integer, SortedMap<Integer, Integer>> item : map.entrySet()) {
			int index = 0;
			Iterator<Entry<Integer, Integer>> iterator = item.getValue().entrySet().iterator();
			while (iterator.hasNext()) {
				iterator.next().setValue(++index);
			}
		}
		for (Point point : list) {
			int p = point.x;
			System.out.println(String.format("%06d%06d", p, map.get(p).get(point.y)));
		}
	}
}
