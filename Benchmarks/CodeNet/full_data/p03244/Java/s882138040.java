import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0;i < n;++i)
			v[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		Map<Integer, Integer> map = new HashMap();
		for(int i = 0;i < n;i+=2) {
			if(map.containsKey(v[i])) {
				int cap = map.get(v[i]);
				map.remove(v[i]);
				map.put(v[i], cap+1);
			}else {
				map.put(v[i], 1);
			}
		}
		
		int max = 0;
		int prev_key = 0;
		for(Integer key : map.keySet()) {
			if(max < map.get(key)) {
				prev_key = key;
				max = map.get(key);
			}
		}
		ans += n/2 - max;
		
		map = new HashMap();
		for(int i = 1;i < n;i+=2) {
			if(map.containsKey(v[i])) {
				int cap = map.get(v[i])+1;
				map.remove(v[i]);
				map.put(v[i], cap);
			}else {
				map.put(v[i], 1);
			}
		}
		
		max = 0;
		for(Integer key : map.keySet()) {
			if(max < map.get(key) && key != prev_key) {
				max = map.get(key);
			}
		}
		ans += n/2 - max;
		
		System.out.println(ans);
	}
}
