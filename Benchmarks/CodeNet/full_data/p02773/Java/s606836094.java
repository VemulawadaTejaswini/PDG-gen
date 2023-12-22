import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int max = 1, rem = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				rem = map.get(s)+1;
				map.replace(s, rem);
				max = Math.max(max,rem);
			}else map.put(s, 1);
		}
		List<String> list = new ArrayList<String>();
		for(String key : map.keySet()) if(map.get(key) == max) list.add(key);
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(String key : list) sb.append(key+"\n");
		System.out.println(new String(sb));
	}
}
