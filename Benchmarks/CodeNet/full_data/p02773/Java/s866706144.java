import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> s = new LinkedHashMap<String,Integer>();
		for(int i = 0; i < n; i++) {
			String temp = sc.next();
			if(s.containsKey(temp)) {
				int c = s.get(temp)+1;
				s.put(temp, c);
			}
			else {
				s.put(temp, 1);
			}
		}
		Map<String,Integer> ans = new TreeMap<String,Integer>();
		int count = 0;
		for(String key:s.keySet()) {
			if(count < s.get(key)) {
				ans.clear();
				count = s.get(key);
				ans.put(key, count);
			}
			else if(count==s.get(key)) {
				ans.put(key, count);
			}
		}
		for(String key:ans.keySet()) {
			System.out.println(key);
		}
	}
}