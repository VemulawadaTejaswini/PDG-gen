


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, ArrayList<Range>> leftMap = new HashMap<>();
		HashMap<Integer, ArrayList<Range>> rightMap = new HashMap<>();
		for (int i=0;i<=n;i++) {
			leftMap.put(i, new ArrayList<Range>());
			rightMap.put(i, new ArrayList<Range>());
		}

		for (int i=0;i<m;i++) {
			Range range = new Range();
			range.left=sc.nextInt();
			range.right=sc.nextInt();
			range.cost=sc.nextLong();
			leftMap.get(range.left).add(range);
			rightMap.get(range.right).add(range);
		}

		TreeMap<Long, HashSet<Range>> available = new TreeMap<>();

		Range dummy = new Range();
		dummy.left=1;
		dummy.right=1;
		dummy.cost=0L;
		dummy.totalCost=0L;
		rightMap.get(1).add(dummy);
		available.put(0L, new HashSet<Range>());
		available.get(0L).add(dummy);

		for (int i=1;i<=n;i++) {
			for (Range r : rightMap.get(i-1)) {
				if (available.containsKey(r.totalCost)) {
					available.get(r.totalCost).remove(r);
					if (available.get(r.totalCost).isEmpty()) {
						available.remove(r.totalCost);
					}
				}
			}
			for (Range r : leftMap.get(i)) {
				if (!available.isEmpty()) {
					r.totalCost=available.firstKey()+r.cost;
					if (!available.containsKey(r.totalCost)) {
						available.put(r.totalCost, new HashSet<Range>());
					}
					available.get(r.totalCost).add(r);
				}
			}
		}

		System.out.println(available.isEmpty() ? -1 : available.firstKey());
	}

}

class Range {
	int left;
	int right;
	long cost;
	long totalCost;
}


