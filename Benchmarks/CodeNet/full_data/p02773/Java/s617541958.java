import java.util.*;
import java.math.*;
public class Main {
	static int[] color;
	static int[] component;
	static int component_count;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<>();
		int n = Integer.parseInt(in.next());
		for(int i = 0; i < n; i++) {
			String cur = in.next();
			if(map.containsKey(cur)) {
				int val = map.get(cur);
				map.put(cur, val + 1);
			}else map.put(cur, 1);
		}
		int cnt = 0;
		List<String> ans = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if((int)entry.getValue() == cnt) {
				ans.add(entry.getKey());
			}else if((int)entry.getValue() > cnt) {
				cnt = entry.getValue();
				ans.clear();
				ans.add(entry.getKey());
			}
		}
		Collections.sort(ans);
		for(int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
} 
