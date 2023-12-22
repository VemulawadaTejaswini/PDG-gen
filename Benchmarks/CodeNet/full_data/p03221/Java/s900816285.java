
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] pList = new int[m];
		int[] yList = new int[m];
		Map<Integer, TreeSet<Integer>> treeMap = new HashMap<Integer, TreeSet<Integer>>();


		for (int i = 0; i < m; i++) {
			int pi = scanner.nextInt();
			int yi = scanner.nextInt();
			TreeSet<Integer> piTree;
			if (treeMap.containsKey(pi)) {
				piTree = treeMap.get(pi);
			} else {
				piTree = new TreeSet<Integer>();
				treeMap.put(pi, piTree);
			}
			piTree.add(yi);
			pList[i] = pi;
			yList[i] = yi;
		}

		Map<Integer, HashMap<Integer, Integer>> mapList = new HashMap<Integer, HashMap<Integer, Integer>>();
		for (int pi : treeMap.keySet()) {
			TreeSet<Integer> piTree = treeMap.get(pi);
			HashMap<Integer, Integer> piMap = new HashMap<Integer, Integer>();
			int j = 0;
			for (int yi : piTree) {
				piMap.put(yi, ++j);
			}
			mapList.put(pi, piMap);
		}

		for (int i = 0; i < m; i++) {
			HashMap<Integer, Integer> piMap = mapList.get(pList[i]);
			int num = piMap.get(yList[i]);
			System.out.println(String.format("%06d", pList[i]) + String.format("%06d", num));
		}

	}

}
