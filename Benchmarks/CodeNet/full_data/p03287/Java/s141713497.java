import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		long ans = 0, val;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr[i] %= m;
		}
		Map<Integer, Long> map = new HashMap<Integer, Long>(), tmp = new HashMap<Integer, Long>();
		Set<Integer> set;
		map.put(arr[0], 1L);
		if(arr[0] == 0)ans++;
		for(int i = 1; i < n; i++) {
			tmp.clear();
			set = map.keySet();
			for(Integer key : set) {
				val = map.get(key);
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
