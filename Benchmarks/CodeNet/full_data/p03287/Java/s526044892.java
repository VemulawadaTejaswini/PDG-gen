import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int  n = Integer.parseInt(t[0]);
			long m = Long.parseLong(t[1]);

			String[] r = sc.nextLine().split(" ");
			long[] list = new long[n];
			Map<Long, Long> map = new HashMap<>();
			map.put(0L, 1L);
			long sum = 0;
			for(int i = 0 ; i < n; i ++) {
				list[i] = Long.parseLong(r[i]);
				sum  = (sum + list[i]) % m;

				if(map.containsKey(sum)) {
					map.put(sum, map.get(sum) + 1);
				}else {
					map.put(sum,1L);
				}
			}

			long cnt = 0;
			for(Entry<Long, Long> e : map.entrySet()){

				long x = e.getValue();
				cnt += (x  * (x - 1)) / 2;
			}
			System.out.println(cnt);
		}
	}
