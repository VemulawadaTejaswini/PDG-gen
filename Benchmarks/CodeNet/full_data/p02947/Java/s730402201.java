import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		String stmp;
		int idx;
		HashMap<String, Integer> sMap = new HashMap<String, Integer>();

		Integer num = 0;
		String s;

		for (idx = 0; idx < N; idx++) {
			stmp = sc.next();
			char[] c1 = stmp.toCharArray();
			Arrays.sort(c1);
			s = String.valueOf(c1);

			num = sMap.get(s);
			if (num == null) {
				sMap.put(s, 1);
			} else {
				sMap.put(s, num + 1);
			}
		}

		long match = 0;
		ArrayList<Integer> numList = new ArrayList<>(sMap.values());
		for (Integer nums : numList) {
			if (nums > 1) {
				match += (nums * (nums-1)) / 2;
			}
		}

		System.out.println(match);

	}

}
