import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Map<Character,List<Integer>> next = new HashMap<Character,List<Integer>>();
		for(int i = 0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			next.computeIfAbsent(ch, c -> new ArrayList<Integer>()).add(i);
		}
		
		long rep = 0;

		int pos = 0;
		for(char ch : t.toCharArray()) {
			
			List<Integer> list = next.get(ch);
			if(list == null) {
				System.out.println(-1);
				return;
			}
			
			int ip = Collections.binarySearch(list, pos);
			if(ip < 0) {
				ip = -ip-1;
			}
			if(ip == list.size()) {
				rep++;
				ip = 0;
			}
			
			pos = list.get(ip)+1;
		}
		System.out.println(rep*s.length() + pos);
		
	}
}
