import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];
		String tmp[] = new String[10];
		String tmpStr;
		Map<String, Integer> map = new HashMap<String, Integer>();
		long answer = 0;

		for (int i = 0; i < N; i++) {
			tmpStr = sc.next();
			tmp = tmpStr.split("");
			Arrays.sort(tmp);
			s[i] = Arrays.toString(tmp);

			if (map.containsKey(Arrays.toString(tmp))) {
				map.put(Arrays.toString(tmp), (int)map.get(Arrays.toString(tmp)) + 1);
			} else {
				map.put(Arrays.toString(tmp), 1);
			}
		}

		for (String key : map.keySet()) {
			int n = map.get(key);
			if (2 < n) {
				answer += factorial(n) / (factorial(n - 2) * 2);
			} else if (n == 2) {
				answer += 1;
			}
		}
		System.out.println(answer);
	}

	private static long factorial(long n) {
		if (n != 1) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
}
