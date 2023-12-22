import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong(), ans = 0, key, val;
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			arr[i] %= m;
		}
		Map<Long, Long> map = new HashMap<Long, Long>();
		map.put(arr[0], 1L);
		if(arr[0] == 0)ans++;
		for(int i = 1; i < n; i++) {
			Map<Long, Long> tmp = new HashMap<Long, Long>();
			for(Map.Entry<Long, Long> entry : map.entrySet()) {
				key = entry.getKey();
				val = entry.getValue();
				key = (key + arr[i]) % m;
				if(key == 0)ans += val;
				tmp.put(key, val);
			}
			if(arr[i] == 0)ans += 1;
			if(tmp.containsKey(arr[i])) {
				tmp.put(arr[i], tmp.get(arr[i])+1);
			} else {
				tmp.put(arr[i], 1L);
			}
			map.clear();
			map.putAll(tmp);
		}
		System.out.println(ans);
	}
}
