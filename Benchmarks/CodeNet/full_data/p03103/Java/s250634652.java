
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n   = Integer.parseInt(tmp[0]);
		int m   = Integer.parseInt(tmp[1]);
		Map<Long, Long> map = new HashMap<>();

		for(int i = 0; i < n; i++) {

			long a = scanner.nextLong();
			long b = scanner.nextLong();

			map.put(a, b);
		}

		Object[] mapKey = map.keySet().toArray();
		Arrays.sort(mapKey);


		long ans = 0;
		for(Long key : map.keySet()) {

			long x = map.get(key);

			if(x >= m) {

				ans += key * m;
				break;
			}else{

				ans += key * x;
				m   -= x;
			}
		}

		System.out.println(ans);


	}
}
