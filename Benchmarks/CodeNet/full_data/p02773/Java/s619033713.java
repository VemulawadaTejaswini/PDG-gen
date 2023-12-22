import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<String, Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < n; i++) {
			String s = scan.next();
			if(map.get(s) == null) {
				map.put(s, 1);
			} else {
				int num = map.get(s);
				map.put(s, num + 1);
			}
		}
		int max= 0;
		List<String> list = new ArrayList<String>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				list.clear();
				list.add(entry.getKey());
			} else if(max == entry.getValue()){
				list.add(entry.getKey());
			}
		}
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}