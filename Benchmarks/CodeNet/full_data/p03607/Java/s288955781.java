import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		HashMap<Integer,Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {

			int num = sc.nextInt();
			Integer cnt = map.get(num);

			if (cnt == null) {
				map.put(num, 1);
			} else {
				map.put(num, cnt + 1);
			}
		}

		ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,Integer>>(map.entrySet());

		int ans = 0;

		for(Entry e: list) {
			if ((int)e.getValue() %2 !=0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
