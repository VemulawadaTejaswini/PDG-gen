import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempo = sc.nextInt();
		int max = sc.nextInt();
		int amount = 0;
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < tempo; i++) {
			int key = sc.nextInt();
			int value = sc.nextInt();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + value);
			} else {
				map.put(key, value);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (max <= entry.getValue()) {
				amount += max * entry.getKey();
				break;
			} else {
				amount += entry.getKey() * entry.getValue();
				max -= entry.getValue();
			}
		}
		System.out.println(amount);
		sc.close();
	}
}