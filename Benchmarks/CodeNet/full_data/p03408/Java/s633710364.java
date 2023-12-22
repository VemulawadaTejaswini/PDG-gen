import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Scanner scanner;
	static Map<String, Integer> keyCost;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		keyCost = new HashMap<>();
		try {
			addCost(1);
			addCost(-1);

			Entry<String, Integer> maxCostEntry = null;
			;
			int i = 0;
			for (Entry<String, Integer> entry : keyCost.entrySet()) {
				if (i == 0) {
					maxCostEntry = entry;
				} else {
					if (maxCostEntry.getValue() < entry.getValue()) {
						maxCostEntry = entry;
					}
				}
				i++;
			}
			System.out.print(maxCostEntry.getValue() > 0 ? maxCostEntry.getValue() : 0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static void addCost(int cost) {
		int lineNum = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < lineNum; i++) {
			String key = scanner.nextLine();
			if (!keyCost.containsKey(key)) {
				keyCost.put(key, cost);
			} else {
				keyCost.replace(key, keyCost.get(key) + cost);
			}
		}
	}
}
