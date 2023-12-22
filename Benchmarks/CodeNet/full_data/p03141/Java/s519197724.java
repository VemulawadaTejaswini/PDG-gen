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
		final List<Integer> sortedKeysA = new LinkedList<>();
		final List<Integer> sortedKeysB = new LinkedList<>();
		final boolean[] selected = new boolean[N];

		for (int i = 0; i < N; i++) {
			final long prefA = sc.nextLong();
			final long prefB = sc.nextLong();
			sc.nextLine();

			A.put(i, prefA);
			B.put(i, prefB);
			selected[i] = false;
			
			if (i == 0) {
				sortedKeysA.add(i);
				sortedKeysB.add(i);
				continue;
			}

			boolean aInserted = false;
			boolean bInserted = false;
			for (int j = 0; j < i; j++) {
				final int keyA = sortedKeysA.get(j);
				final int keyB = sortedKeysB.get(j);

				final long valueA = A.get(keyA);
				final long valueB = B.get(keyB);

				if (!aInserted && prefA >= valueA) {
					sortedKeysA.add(j, i);
					aInserted = true;
				}
				if (!bInserted && prefB >= valueB) {
					sortedKeysB.add(j, i);
					bInserted = true;
				}

				if (aInserted && bInserted) {
					break;
				}
			}
		}

		long takahashi = 0;
		long aoki = 0;
		int tIndex = 0;
		int aIndex = 0;

		int numTrials = 0;
		while (numTrials < N) {
			boolean t = (numTrials % 2) == 0;

			final int maxTId = getHighest(N, tIndex, A, sortedKeysA, selected);
			final long prefMaxT= A.get(maxTId);
			final int nextTId = getSecondHighest(N, tIndex, A, sortedKeysA, selected);
			final long prefNextT = A.get(maxTId);
			
			long expT = prefMaxT - prefNextT;

			final int maxAId = getHighest(N, aIndex, B, sortedKeysB, selected);
			final long prefMaxA= B.get(maxTId);
			final int nextAId = getSecondHighest(N, aIndex, B, sortedKeysB, selected);
			final long prefNextA = B.get(maxTId);
			
			long expA = prefMaxA - prefNextA;

			if (t) {
				if (expT > expA) {
					takahashi += prefMaxT;
					selected[maxTId] = true;
					tIndex++;
				} else {
					takahashi += A.get(maxAId);
					selected[maxAId] = true;
					aIndex++;
				}
			} else {
				if (expA > expT) {
					aoki += prefMaxA;
					selected[maxAId] = true;
					aIndex++;
				} else {
					aoki += B.get(maxTId);
					selected[maxTId] = true;
					tIndex++;
				}
			}

			numTrials++;
		}

		System.out.println(takahashi - aoki);
	}

	private static int getHighest(int N, int index, Map<Integer, Long> prefs,
			List<Integer> sortedKeys, boolean[] selected) {
		for (int i = index; i < N; i++) {
			final int key = sortedKeys.get(i);
			final boolean sel = selected[key];

			if (!sel) {
				return key;
			}
		}

		return -1;
	}
	
	private static int getSecondHighest(int N, int index, Map<Integer, Long> prefs,
			List<Integer> sortedKeys, boolean[] selected) {
		boolean firstFound = false;
		for (int i = index; i < N; i++) {
			final int key = sortedKeys.get(i);
			final boolean sel = selected[key];

			if (!sel) {
				if (firstFound) {
					return key;
				} else {
					firstFound = true;
				}
			}
		}

		return -1;
	}

}

class ValueComparator implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		return Long.compare(o2, o1);
	}

}