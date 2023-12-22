import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		Map<Integer,Integer> cityMap = new HashMap<Integer,Integer>();

		for(int i = 0; i < n; i++) {
			cityMap.put(i, sc.nextInt());
		}

		List<Entry<Integer,Integer>> cityList = new ArrayList<Entry<Integer,Integer>>(cityMap.entrySet());

		Collections.sort(cityList, new Comparator<Entry<Integer,Integer>>() {
			public int compare(Entry<Integer,Integer> obj1, Entry<Integer,Integer> obj2) {
					return obj1.getValue().compareTo(obj2.getValue());
			}
		});

		// 確定した一番左のインデックス
		int lIndex = cityList.get(0).getKey();
		// ここより左側に橋を架けるとき基準にするべきインデックス
		int minIndex = cityList.get(0).getKey();
		// ここより右側に橋を架けるとき基準にするべきインデックス
		int maxIndex = cityList.get(0).getKey();
		// 確定した一番右のインデックス
		int uIndex = cityList.get(0).getKey();

		Map<Integer, Integer> keepMinMaxMap = new HashMap<Integer, Integer>();
		long amt = 0;
		for(int i = 1; i < n; i++) {
			Entry<Integer, Integer> cityE = cityList.get(i);
			int index = cityE.getKey();
			int value = cityE.getValue();
			if (index < lIndex) {
				int minIndexValue = cityMap.get(minIndex);
				int far = minIndex - index;
				if(value - minIndexValue > far * d) {
					// 全部minIdexから！
					for(int j = lIndex - 1; j >= index; j--) {
						if(keepMinMaxMap.containsKey(j)) {
							minIndex = keepMinMaxMap.get(j);
							minIndexValue = cityMap.get(minIndex);
						}
						int minFar = minIndex - j;
						amt += minFar * d + cityMap.get(j) + minIndexValue;
					}
				} else {
					// いい感じの位置を探す
					int evenFar = (value - minIndexValue) / d;
					// これから先でkeyから先はvalueがminIndexになる
					int key;
					if( (value - minIndexValue) % d == 0 && evenFar != 0) {
						key = evenFar;
					} else {
						key = evenFar + 1;
					}
					keepMinMaxMap.put(index - key, index);
					int keepIndex = index;
					for(int j = lIndex - 1; j > index; j--) {
						if(keepMinMaxMap.containsKey(j)) {
							minIndex = keepMinMaxMap.get(j);
							minIndexValue = cityMap.get(minIndex);
						}
						int jValue = cityMap.get(j);
						int minFar = minIndex - j;
						int currentFar = j - index;
						int keepVal = 0;
						if(evenFar <= minFar - currentFar) {
							// ここから
							amt += currentFar * d + jValue + value;
							// minとつなぐところを変えたほうがいいか
							int diff = (currentFar * d) - jValue;
							if(diff > 0 && diff > keepVal) {
								keepVal = diff;
								keepIndex = j;
							}
						} else {
							// minから
							amt += minFar * d + jValue + minIndexValue;
						}
					}
					// min～をつなぐためにつなぐところ決め
					if(keepMinMaxMap.containsKey(keepIndex)) {
						minIndex = keepMinMaxMap.get(keepIndex);
						minIndexValue = cityMap.get(minIndex);
					}
					amt += (minIndex - keepIndex) * d + cityMap.get(keepIndex) + minIndexValue;
				}
				lIndex = index;
			} else if(uIndex < index) {
				int maxIndexValue = cityMap.get(maxIndex);
				int far = index - maxIndex;
				if(value - maxIndexValue > far * d) {
					// 全部maxIdexから！
					for(int j = uIndex + 1; j <= index; j++) {
						if(keepMinMaxMap.containsKey(j)) {
							maxIndex = keepMinMaxMap.get(j);
							maxIndexValue = cityMap.get(maxIndex);
						}
						int maxFar = j - maxIndex;
						amt += maxFar * d + cityMap.get(j) + maxIndexValue;
					}
				} else {
					// いい感じの位置を探す
					int evenFar = (value - maxIndexValue) / d;
					// これから先でkeyから先はvalueがmaxIndexになる
					int key;
					if ((value - maxIndexValue) % d == 0 && evenFar != 0) {
						key = evenFar;
					} else {
						key = evenFar + 1;
					}
					keepMinMaxMap.put(index + key, index);
					int keepIndex = index;
					for(int j = uIndex + 1; j < index; j++) {
						if(keepMinMaxMap.containsKey(j)) {
							maxIndex = keepMinMaxMap.get(j);
							maxIndexValue = cityMap.get(maxIndex);
						}
						int jValue = cityMap.get(j);
						int maxFar = j - maxIndex;
						int currentFar = index - j;
						int keepVal = 0;
						if(evenFar <= maxFar - currentFar) {
							// ここから
							amt += currentFar * d + jValue + value;
							// maxとつなぐところを変えたほうがいいか
							int diff = (currentFar * d) - jValue;
							if(diff > 0 && diff > keepVal) {
								keepVal = diff;
								keepIndex = j;
							}
						} else {
							// minから
							amt += maxFar * d + jValue + maxIndexValue;
						}
					}
					// max～をつなぐためにつなぐところ決め
					if(keepIndex == index && keepMinMaxMap.containsKey(keepIndex)) {
						maxIndex = keepMinMaxMap.get(keepIndex);
						maxIndexValue = cityMap.get(maxIndex);
					}
					amt += (keepIndex - maxIndex) * d + cityMap.get(keepIndex) + maxIndexValue;
				}
				uIndex = index;
			} else {
				// minとmaxの間はもう決まってる
				continue;
			}

			if(lIndex == 0 && uIndex == n) {
				break;
			}
		}

		System.out.println(amt);

	}
}