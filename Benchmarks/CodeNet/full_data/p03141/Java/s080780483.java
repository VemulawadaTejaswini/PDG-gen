import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		sc.nextLine();
		final Map<Integer, Long> A = new HashMap<>();
		final Map<Integer, Long> B = new HashMap<>();
		final boolean[] selected = new boolean[N];

		for (int i = 0; i < N; i++) {
			final String line = sc.nextLine();
			final String[] split = line.split(" ");
			final long prefA = Long.parseLong(split[0]);
			final long prefB = Long.parseLong(split[1]);

			A.put(i, prefA);
			B.put(i, prefB);
			selected[i] = false;
		}

		List<Map.Entry<Integer, Long>> sortedA = A.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(new ValueComparator()))
				.collect(Collectors.toCollection(LinkedList::new));
		
		List<Map.Entry<Integer, Long>> sortedB = B.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(new ValueComparator()))
				.collect(Collectors.toCollection(LinkedList::new));

		long takahashi = 0;
		long aoki = 0;

		int numTrials = 0;
		while (numTrials < N) {
			boolean t = (numTrials % 2) == 0;
			
			long maxT = sortedA.get(0).getValue();
			long nextT = (sortedA.size() > 1) ? sortedA.get(1).getValue() : 0;
			long expT = maxT - nextT;
			
			long maxA = sortedB.get(0).getValue();
			long nextA = (sortedB.size() > 1) ? sortedB.get(1).getValue() : 0;
			long expA = maxA - nextA;

			if (t) {
				if (expT > expA) {
					// take tId
					takahashi += takeFromMine(sortedA, sortedB);
				} else {
					// take aId
					takahashi += takeFromAnother(sortedA, sortedB);
				}
			} else {
				if (expA > expT) {
					// take aId
					aoki += takeFromMine(sortedB, sortedA);
				} else {
					aoki += takeFromAnother(sortedB, sortedA);
				}
			}

			numTrials++;
		}

		System.out.println(takahashi - aoki);
	}
	
	private static long takeFromMine(List<Map.Entry<Integer, Long>> mine, List<Map.Entry<Integer, Long>> another) {
		final Map.Entry<Integer, Long> entry = mine.get(0);
		final int key = entry.getKey();
		mine.remove(0);
		
		int rmIndex = -1;
		for (int j = 0; j < another.size(); j++) {
			int k = another.get(j).getKey();
			if (k == key) {
				rmIndex = j;
				break;
			}
		}
		
		another.remove(rmIndex);
		
		return entry.getValue();
	}

	private static long takeFromAnother(List<Map.Entry<Integer, Long>> mine, List<Map.Entry<Integer, Long>> another) {
		final Map.Entry<Integer, Long> entry = another.get(0);
		final int key = entry.getKey();
		another.remove(0);
		
		int rmIndex = -1;
		for (int j = 0; j < mine.size(); j++) {
			int k = mine.get(j).getKey();
			if (k == key) {
				rmIndex = j;
				break;
			}
		}
		
		final long result = mine.get(rmIndex).getValue();
		mine.remove(rmIndex);
		
		return result;
	}
	
}

class ValueComparator implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		return Long.compare(o2, o1);
	}

}