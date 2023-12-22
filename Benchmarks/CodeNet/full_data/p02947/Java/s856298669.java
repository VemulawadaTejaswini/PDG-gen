import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];

		long total = 0l;

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			char[] chars = s[i].toCharArray();
			Arrays.sort(chars);
			s[i] = new String(chars);
			map.put(s[i], -1);
		}

		for (int i = 0; i < n; i++) {
			map.put(s[i], map.get(s[i]) + 1);
			total += map.get(s[i]);
		}

		System.out.println(total);
		sc.close();

	}

}