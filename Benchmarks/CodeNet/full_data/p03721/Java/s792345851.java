import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Map<Integer, Integer> intMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] conf = scanner.nextLine().split(" ");
		int insertCount = Integer.parseInt(conf[0]);
		int rank = Integer.parseInt(conf[1]);

		for (int i = 0; i < insertCount; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			addIfExistsElseThenPut(Integer.valueOf(inputs[0]), Integer.valueOf(inputs[1]));
		}

		ArrayList<Integer> keys = new ArrayList<>();
		keys.addAll(intMap.keySet());
		keys.sort(Comparator.naturalOrder());
		int currentRank = 0;
		for (Integer key: keys) {
			currentRank += intMap.get(key);
			if (currentRank >= rank) {
				System.out.println(key);
				break;
			}
		}
	}

	private static void addIfExistsElseThenPut(int item, int number) {
		if (intMap.containsKey(item)) {
			intMap.put(item, intMap.get(item) + number);
		} else {
			intMap.put(item,  number);
		}
	}
}
