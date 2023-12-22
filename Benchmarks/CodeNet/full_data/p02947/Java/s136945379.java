import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		Map<String, Integer> map = new HashMap<>();
		long cnt = 0;

		for (int i = 0; i < N; i++) {
			String[] strArr = sc.nextLine().split("");
			Arrays.sort(strArr);
			String str = String.join(",", strArr);
			if (map.containsKey(str)) {
				int freq = map.get(str) + 1;
				map.put(str, freq);
				cnt += freq;
			}
			else {
				map.put(str, 0);
			}
		}

		System.out.println(cnt);
	}
}