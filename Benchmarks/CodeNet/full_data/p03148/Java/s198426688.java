import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {

		String bufferStr = "str";
		HashMap<String, Integer> hashMapPrioritizeDeliciousNess = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String input2 = sc.nextLine();
		String[] temp2 = input2.split(" ");

		int sushiType = Integer.parseInt(temp2[0]);
		int howMany = Integer.parseInt(temp2[1]);

		String[] input = new String[sushiType];
		for (int i = 0; i < sushiType; i++) {
			input[i] = sc.nextLine();
			String[] temp = input[i].split(" ");
			int sushiTypeNumber = Integer.parseInt(temp[0]);
			int deliciousNess = Integer.parseInt(temp[1]);
			hashMapPrioritizeDeliciousNess.put(sushiTypeNumber + "_" + bufferStr + i, deliciousNess);
		}

		Map<String, Integer> sortedHashMap = sortByValue(hashMapPrioritizeDeliciousNess);
		Set<Integer> uniqueSushiType = new LinkedHashSet<Integer>();
		int i = 1;
		long deliciousnessTotalSolution1 = 0;
		for (String keys : sortedHashMap.keySet()) {
			int uniqueSushiTopping = Integer.parseInt(keys.split("_")[0]);
			int sushiDeliciousNess = sortedHashMap.get(keys);
			uniqueSushiType.add(uniqueSushiTopping);
			deliciousnessTotalSolution1 += sushiDeliciousNess;
			if (i == howMany)
				break;
			i++;
		}
		deliciousnessTotalSolution1 += (uniqueSushiType.size() * uniqueSushiType.size());
		
		uniqueSushiType = new LinkedHashSet<Integer>();
		i = 1;
		long deliciousnessTotalSolution2 = 0;
		int uniqueSushiToppingBefore = 0;
		int sushiDeliciousNessBefore = 0;
		for (String keys : sortedHashMap.keySet()) {
			if (i == 1) {
				int uniqueSushiTopping = Integer.parseInt(keys.split("_")[0]);
				int sushiDeliciousNess = sortedHashMap.get(keys);
				uniqueSushiType.add(uniqueSushiTopping);
				deliciousnessTotalSolution2 += sushiDeliciousNess;

				uniqueSushiToppingBefore = uniqueSushiTopping;
				sushiDeliciousNessBefore = sushiDeliciousNess;
			} else {
				int uniqueSushiTopping = Integer.parseInt(keys.split("_")[0]);
				int sushiDeliciousNess = sortedHashMap.get(keys);
				// same topping with before and more delicious?
				if(uniqueSushiToppingBefore == uniqueSushiTopping && sushiDeliciousNessBefore < sushiDeliciousNess) {
					uniqueSushiType.add(uniqueSushiTopping);
					deliciousnessTotalSolution2 = deliciousnessTotalSolution2 - sushiDeliciousNessBefore + sushiDeliciousNess;
				}
				else if (uniqueSushiToppingBefore != uniqueSushiTopping){
					uniqueSushiType.add(uniqueSushiTopping);
					deliciousnessTotalSolution2 += sushiDeliciousNess;

					uniqueSushiToppingBefore = uniqueSushiTopping;
					sushiDeliciousNessBefore = sushiDeliciousNess;
				}
			}
			i++;
		}
		
		deliciousnessTotalSolution2 += (uniqueSushiType.size() * uniqueSushiType.size());
		System.out.print(Math.max(deliciousnessTotalSolution1, deliciousnessTotalSolution2));
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		Collections.reverse(list);

		Map<K, V> result = new LinkedHashMap<>();
		for (Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}

}