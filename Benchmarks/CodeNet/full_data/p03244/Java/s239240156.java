import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		in.close();
		List<Integer> v = new ArrayList<>(n);
		for (int i = 0; i < n; ++i) {
			v.add(Integer.parseInt(tokens[i]));
		}
		Map<Integer, Integer> oddCount = count(v, false);
		Map<Integer, Integer> evenCount = count(v, true);
		int oddSelect = getMaxCountKey(oddCount);
		int evenSelect = getMaxCountKey(evenCount);
		if (oddSelect != evenSelect) {
			int result = getChangeCount(oddCount, oddSelect) + getChangeCount(evenCount, evenSelect);
			System.out.println(result);
		} else {
			int oddChangeNum = getChangeCount(oddCount, oddSelect);
			int evenChangeNum = getChangeCount(evenCount, evenSelect);
			if (oddChangeNum < evenChangeNum) {
				// odd側に合わせる
				evenSelect = getSecondCountKey(evenCount, evenSelect);
				evenChangeNum = getChangeCount(evenCount, evenSelect);
			} else {
				// even側に合わせる
				oddSelect = getSecondCountKey(oddCount, oddSelect);
				oddChangeNum = getChangeCount(oddCount, oddSelect);
			}
			System.out.println((oddChangeNum + evenChangeNum));
		}
	}

	private static int getChangeCount(Map<Integer, Integer> count, int select) {
		int result = 0;
		for (Integer key : count.keySet()) {
			if (key != select) {
				result += count.get(key);
			}
		}
		return result;
	}

	private static int getSecondCountKey(Map<Integer, Integer> count, int maxKey) {
		int result = -1;
		int index = -1;
		for (Integer key : count.keySet()) {
			if (key != maxKey) {
				if (result < count.get(key)) {
					result = count.get(key);
					index = key;
				}
			}
		}
		return index;
	}

	private static int getMaxCountKey(Map<Integer, Integer> count) {
		int result = -1;
		int index = -1;
		for (Integer key : count.keySet()) {
			if (result < count.get(key)) {
				result = count.get(key);
				index = key;
			}
		}
		return index;
	}

	private static Map<Integer, Integer> count(List<Integer> v, boolean isEven) {
		Map<Integer, Integer> result = new HashMap<>();
		if (!isEven) {
			// oddパターンをカウント
			for (int i = 0; i < v.size(); i = i + 2) {
				int num = v.get(i);
				if (!result.containsKey(num)) {
					result.put(num, 1);
				} else {
					int count = result.get(num);
					result.put(num, count + 1);
				}
			}
		} else {
			// evenパターンをカウント
			for (int i = 1; i < v.size(); i = i + 2) {
				int num = v.get(i);
				if (!result.containsKey(num)) {
					result.put(num, 1);
				} else {
					result.put(num, result.get(num) + 1);
				}
			}
		}
		return result;
	}
}