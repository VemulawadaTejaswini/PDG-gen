import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// standard input
		StringBuilder s = new StringBuilder(sc.next());

		// process
		int[] frequencyArray = new int[26];
		int length = s.length();
		for (int i = 0; i < length; i++) {
			frequencyArray[s.charAt(i) - 97]++;
		}

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < 26; i++) {
			if (frequencyArray[i] > 0) {
				map.put((char) (i + 97), frequencyArray[i]);
			}
		}

		map = sortByValue(map);
		int totalRemove = 0;
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			char character = entry.getKey();
			int numCharacter = entry.getValue();
			for (int i = 0; i < numCharacter; i++) {
				boolean isRemoved = removeValue(s, character, numCharacter);
				if (isRemoved) {
					totalRemove++;
				} else {
					break;
				}
			}
		}

		// standard output
		System.out.println(totalRemove % 2 == 0? "Second": "First");
	}

	public static boolean removeValue(StringBuilder str, char targetChar, int numChar) {
		int length = str.length();
		boolean result = false;
		for (int i = 0; i < length; i++) {
			if (numChar <= 0) {
				break;
			}
			if (str.charAt(i) == targetChar) {
				numChar--;
				if (i == 0 || i == (length - 1)) {
					continue;
				} else if (str.charAt(i - 1) == str.charAt(i + 1)) {
					continue;
				} else {
					str.deleteCharAt(i);
					result = true;
					break;
				}
			}
		}
		return result;
	}


	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		return map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(/* Collections.reverseOrder() */))
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new
				));
	}
}
