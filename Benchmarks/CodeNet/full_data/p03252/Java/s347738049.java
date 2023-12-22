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
		Map<Character, Integer> s_map = new HashMap<>();
		Map<Character, Integer> t_map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if(s_map.containsKey(s_map.get(temp))) {
				s_map.put(temp, s_map.get(temp) + 1);
			} else {
				s_map.put(temp, 1);
			}
		}
		for(int i = 0; i < t.length(); i++) {
			char temp = t.charAt(i);
			if(t_map.containsKey(t_map.get(temp))) {
				t_map.put(temp, t_map.get(temp) + 1);
			} else {
				t_map.put(temp, 1);
			}
		}
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
		boolean ok = true;
		if(s_list.size() == t_list.size()) {
			for(int i = 0; i < s_list.size(); i++) {
				if(s_list.get(i) != t_list.get(i)) ok = false;
			}
		} else {
			ok = false;
		}
		System.out.println(ok ? "Yes" : "No");
	}
}


