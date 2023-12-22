import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, Integer> map = new HashMap<>();
		long result = 0L;
		for (int i = 0; i < n; i++) {
			char[] temp = scanner.next().toCharArray();
			Arrays.parallelSort(temp);
			String s = new String(temp);
			if(map.containsKey(s)) {
				map.put(s, map.get(s)*2-1);
			} else {
				map.put(s,0);
			}
		}
		for(Integer value : map.values()) {
			result += value;
		}

		System.out.println(result);
	}

}