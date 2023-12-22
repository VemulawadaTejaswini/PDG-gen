import java.util.*;
import java.math.*;

public class Main {
	private static Map<Long, List<Integer>> diffMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> alist = new ArrayList<>();
		List<Long> blist = new ArrayList<>();
		// Map<Long, Integer> diffMap = new HashMap<>();
		List<Long> diffList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			alist.add(a);
			blist.add(b);
			long diff = a + b;
			putDiffMap(diff, i);
			diffList.add(diff);
		}
		// 値セット完了

		// System.out.println(alist);
		// System.out.println(blist);
		// System.out.println(diffMap);
		// System.out.println(diffList);

		Collections.sort(diffList, Collections.reverseOrder());
		// sumが大きいやつから取っていく

		long preValue = -1;
		long totalHappy = 0;
		boolean isTakahashi = true;
		for (int i = 0; i < n; i++) {
			long currentDiff = diffList.get(i);
			if (currentDiff == preValue) {
				continue;
			}
			preValue = currentDiff;

			List<Integer> curNumber = new ArrayList<>();
			curNumber.addAll(diffMap.get(currentDiff));
			// System.out.println(curNumber);
			// sumが同じ値のリストが取れた
			if (curNumber.size() == 1) {
				totalHappy += isTakahashi ? alist.get(curNumber.get(0)) : -blist.get(curNumber.get(0));
				isTakahashi = !isTakahashi;
				continue;
			}

			List<Long> alittleList = new ArrayList<>();
			Map<Long, List<Integer>> alittlemap = new HashMap<>();

			long maxV = 0;
			int willDeleteNumber = 0;
			for (int j = 0; j < curNumber.size(); j++) {
				long curV = isTakahashi ? alist.get(curNumber.get(j)) : blist.get(curNumber.get(j));
				if (curV >= maxV) {
					willDeleteNumber = j;
					maxV = curV;
				}
			}
			totalHappy = isTakahashi ? totalHappy + maxV : totalHappy - maxV;
			isTakahashi = !isTakahashi;
			curNumber.remove(willDeleteNumber);
		}
		System.out.println(totalHappy);

	}

	private static void putDiffMap(Long diff, int i) {

		List<Integer> list = diffMap.get(diff);
		if (list == null || list.size() == 0) {
			List<Integer> tempList = new ArrayList<>();
			tempList.add(i);
			diffMap.put(diff, tempList);
		} else {
			list.add(i);
			diffMap.put(diff, list);
		}
	}
}
