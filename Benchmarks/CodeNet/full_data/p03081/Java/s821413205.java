import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int masuCount = sc.nextInt();
		int jumonCount = sc.nextInt();
		String str = sc.next();
		char[] masuChars = str.toCharArray();
		Map<Integer, Map<Character, Integer>> masuMap = new HashMap<>();
		// initialize masu
		for(int i = 0; i < masuCount; i++) {
			Map<Character, Integer> masu = new HashMap<>();
			masu.put(masuChars[i], 1);
			masuMap.put(i, masu);
		}

		for(int i=0; i < jumonCount; i++) {
			char input = sc.next().charAt(0);
			// これ1文字目？
			String move = sc.next();
			if(move.equals("L")) {
				for(int j =0; j<masuCount; j++) {
					Map<Character, Integer> masu = masuMap.get(j);
					if(masu.containsKey(input)) {
						int tempValue = masu.get(input);
						masu.put(input, 0);
						if(j != 0) {
							Map<Character, Integer> leftMasu = masuMap.get(j-1);
							for(char c : leftMasu.keySet()) {
								leftMasu.put(c, leftMasu.get(c) + tempValue);
								break;
							}
						}
					}
				}
			}
			if(move.equals("R")) {
				for(int j =0; j<masuCount; j++) {
					Map<Character, Integer> masu = masuMap.get(j);
					if(masu.containsKey(input)) {
						int tempValue = masu.get(input);
						masu.put(input, 0);
						if(j != masuCount -1) {
							Map<Character, Integer> rightMasu = masuMap.get(j+1);
							for(char c : rightMasu.keySet()) {
								rightMasu.put(c, rightMasu.get(c) + tempValue);
								break;
							}
						}
					}
				}
			}
		}
		int golems = 0;
		for(int i = 0; i < masuCount; i++) {
			Map<Character, Integer> masu = masuMap.get(i);
			for(Entry<Character, Integer> entry : masu.entrySet()) {
				golems += entry.getValue();
				break;
			}
		}
		System.out.println(golems);
		sc.close();
	}
}