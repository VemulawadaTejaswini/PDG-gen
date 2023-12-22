import java.util.*;
import java.util.Map.Entry;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		boolean first_flag = true;
		int num = 0;
		ArrayList<String> ans = new ArrayList<String>();
		for(Entry<String, Integer> entry : list) {
			if(first_flag) {
				num = entry.getValue();
				ans.add(entry.getKey());
				first_flag = false;
			} else {
				int value = entry.getValue();
				if(num == value) {
					ans.add(entry.getKey());
				} else {
					break;
				}
			}
		}
		
		Collections.sort(ans);
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
