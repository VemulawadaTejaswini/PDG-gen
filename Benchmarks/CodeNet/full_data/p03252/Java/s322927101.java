import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		Map<String, Integer> s_map = new HashMap<>();
		Map<String, Integer> t_map = new HashMap<>();
//		for(char c = 'a'; c <= 'z'; c++) {
//			s_map.put(String.valueOf(c), 0);
//			t_map.put(String.valueOf(c), 0);
//		}
		for(int i = 0; i < s.length(); i++) {
			String temp = String.valueOf(s.charAt(i));
			if(s_map.containsKey(temp)) {
//				System.out.println(1);
				s_map.put(temp, s_map.get(temp) + 1);
			} else {
//				System.out.println(s_map.get(temp));
				s_map.put(temp, 1);
			}
		}
		for(int i = 0; i < t.length(); i++) {
			String temp = String.valueOf(t.charAt(i));
			if(t_map.containsKey(temp)) {
				t_map.put(temp, t_map.get(temp) + 1);
			} else {
				t_map.put(temp, 1);
			}
		}
//		System.out.println(s_map);
//		System.out.println(t_map);

		List<Integer> s_list = new ArrayList<>();
		List<Integer> t_list = new ArrayList<>();
		for(int key : s_map.values()) {
			s_list.add(key);
		}
		for(int key : t_map.values()) {
			t_list.add(key);
		}
		Collections.sort(s_list);
		Collections.sort(t_list);
//		System.out.println(s_list);
//		System.out.println(t_list);

		boolean ok = true;
		if(s_list.size() == t_list.size()) {
			for(int i = 0; i < s_list.size(); i++) {
				if(s_list.get(i) != t_list.get(i)) ok = false;
			}
		} else {
			ok = false;
		}
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1) && t.charAt(i) != t.charAt(i + 1)) {
				ok = false;
			} else if(s.charAt(i) != s.charAt(i + 1) && t.charAt(i) == t.charAt(i + 1)) {
				ok = false;
			}
		}
		System.out.println(ok ? "Yes" : "No");
	}
}


