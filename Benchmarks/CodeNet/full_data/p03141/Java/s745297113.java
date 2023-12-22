import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] items = new int[N][2];
		Map<Integer, Integer> aPriority = new HashMap<>();
		Map<Integer, Integer> bPriority = new HashMap<>();
		String line = null;
		int i = -1;
		while ((line = br.readLine()) != null) {
			i++;
			items[i][0] = Integer.parseInt(line.split(" ")[0]);
			items[i][1] = Integer.parseInt(line.split(" ")[1]);
			aPriority.put(i, items[i][0]);
			bPriority.put(i, items[i][1]);
		}

		List<Entry<Integer, Integer>> aPriorityList = new ArrayList<Entry<Integer, Integer>>(aPriority.entrySet());
		Collections.sort(aPriorityList, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		Map<Integer, Integer> aMap = new LinkedHashMap<Integer, Integer>();
		for (Entry<Integer, Integer> e : aPriorityList) {
			aMap.put(e.getKey(), e.getValue());
		}

		List<Entry<Integer, Integer>> bPriorityList = new ArrayList<Entry<Integer, Integer>>(bPriority.entrySet());
		Collections.sort(bPriorityList, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		Map<Integer, Integer> bMap = new LinkedHashMap<Integer, Integer>();
		for (Entry<Integer, Integer> e : bPriorityList) {
			bMap.put(e.getKey(), e.getValue());
		}

		long aPoint = 0;
		long bPoint = 0;

		for (int j = 0; j < N; j++) {

			// Aたーん
			if (j % 2 == 0) {

				int aMax = -1;
				int bMax = 0;
				int index = 0;

				for (Entry<Integer, Integer> e : aMap.entrySet()) {

					if (aMax == -1) {
						aMax = e.getValue();
					}

					if (aMax != e.getValue()) {
						break;
					}

					if (bMax == 0 || bMax < items[e.getKey()][1]) {
						bMax = items[e.getKey()][1];
						index = e.getKey();
					}

				}

				aMap.remove(index);
				bMap.remove(index);
				aPoint += aMax;

				// Bたーん
			} else {

				int bMax = -1;
				int aMax = 0;
				int index = 0;

				for (Entry<Integer, Integer> e : bMap.entrySet()) {

					if (bMax == -1) {
						bMax = e.getValue();
					}

					if (bMax != e.getValue()) {
						break;
					}

					if (aMax == 0 || aMax < items[e.getKey()][0]) {
						aMax = items[e.getKey()][0];
						index = e.getKey();
					}

				}

				aMap.remove(index);
				bMap.remove(index);
				bPoint += bMax;

			}
		}
		System.out.println(aPoint - bPoint);
	}
}
