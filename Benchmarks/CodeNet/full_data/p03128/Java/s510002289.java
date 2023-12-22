
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	static int[] ms = new int[] { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
	static int N;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		N = in.nextInt();
		int M = in.nextInt();
		int[] A = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = in.nextInt();
		}

		TreeMap<Integer, Integer> Amap = new TreeMap<Integer, Integer>();
		for (int a : A) {
			int m = ms[a - 1];
			if (Amap.containsKey(m)) {
				int a2 = Amap.get(m);
				if (a > a2) {
					Amap.put(m, a);
				}
			} else {
				Amap.put(m, a);
			}
		}

		LinkedList<Integer> stat = new LinkedList<>();
		for (int i = 0; i < N / Amap.firstKey(); i++) {
			stat.add(Amap.firstEntry().getValue());
		}

		HashSet<List<Integer>> statList = new HashSet<>();
		statList.add(stat);
		for (int i = 0; i < stat.size(); i++) {

			HashSet<List<Integer>> temp = new HashSet<>();
			for (List<Integer> list : statList) {
				for (Entry<Integer, Integer> entry : Amap.entrySet()) {
					int a = entry.getValue();
					LinkedList<Integer> list2 = new LinkedList<>(list);
					list2.addLast(a);
					list2.pollFirst();
					if (check(list2) <= 0) {
						temp.add(list2);
					}
				}
			}
			statList.addAll(temp);
		}

		List<String> ansList = statList.stream().filter(l -> check(l) == 0)
				.map(l -> l.stream().map(n -> n.toString()).collect(Collectors.joining())).collect(Collectors.toList());

		String ans = ansList.stream().max(Comparator.naturalOrder()).get().toString();
		System.out.println(ans);
	}

	static int check(List<Integer> l) {
		int sum = 0;
		for (int n : l) {
			sum += ms[n - 1];
		}
		return Integer.compare(sum, N);
	}

	static String tos(List<Integer> list) {
		return list.stream().map(n -> n.toString()).collect(Collectors.joining());
	}
}
