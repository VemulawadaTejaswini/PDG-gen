import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		Map<Character,List<Integer>> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			char tmp = s.charAt(i);
			if(map.containsKey(tmp)) {
				map.get(tmp).add(i);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(tmp, list);
			}
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			char tmp = s.charAt(i);
			List<Integer> list = map.get(tmp);
			int idx = Collections.binarySearch(list, i);
			for(int k=idx+1;k<list.size();k++) {
				int j = list.get(k);
				if(j<=i) continue;
				int count = 1;
				while(true) {
					if(j+count==n || i+count==j) break;
					if(s.charAt(i+count)==s.charAt(j+count)) count++;
					else break;
				}
				if(count>ans) ans = count;
			}
		}
		System.out.println(ans);
		
		
		in.close();

	}

}
