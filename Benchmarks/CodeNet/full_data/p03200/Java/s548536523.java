import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {
			map.put(i, S.substring(i, i+1));

		}

		int cnt = 0;


		boolean can = true;

		while(can) {
			can = false;
			Map<Integer, String> tmpMap = new HashMap<>();
			tmpMap = map;

			for (int i = 0; i < S.length(); i++) {

				String tmp = map.get(i) + map.get(i+1);

				System.out.println(tmp);
				if (tmp.equals("BW")) {
					tmpMap.put(i, "W");
					tmpMap.put(i+1, "B");
					cnt++;
					can = true;
				}
			}
			map = tmpMap;
		}
		System.out.println(cnt);
	}

}
