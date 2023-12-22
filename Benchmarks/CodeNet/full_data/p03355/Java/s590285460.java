
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			list.add(s.substring(i));
		}
		Collections.sort(list);
		boolean end = false;
		for(String e : list) {
			for(int i = 1; i <= e.length(); i++) {
				String tmp = e.substring(0, i);
				if(!set.contains(tmp) && k != 1) {
					k--;
					set.add(tmp);
				} else if(!set.contains(tmp) && k == 1) {
					System.out.println(tmp);
					end = true;
					break;
				}
			}
			if(end)
				break;
		}

	}

}
