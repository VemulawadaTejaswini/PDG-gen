import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();

			int code = Arrays.stream(str.split("")).mapToInt(s -> Character.getNumericValue(s.charAt(0))).sum();
			map.put(i, code);

			for (int j = i - 1; j >= 0; j--) {
				if (code == map.get(j)) cnt++;
			}
		}

		System.out.println(cnt);
	}
}