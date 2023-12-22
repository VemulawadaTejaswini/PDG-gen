import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i=0; i<S.length(); i++) {
			String s = String.valueOf(S.charAt(i));
			List<Integer> list = map.get(s);
			if (list==null) {
				list = new LinkedList<Integer>();
				map.put(s, list);
			}
			list.add(i);
		}
		for (String s: map.keySet()) {
			Integer[] list = map.get(s).toArray(new Integer[0]);
			if (list.length<2) continue;
			for (int i=0; i<list.length; i++) {
				for (int j=i+1; j<list.length; j++) {
					int charNum = j-i+1;
					int charLen = list[j]-list[i]+1;
					if (charNum<=charLen/2) continue;
					System.out.printf("%d %d\n", list[i]+1, list[j]+1);
					sc.close();
					return;
				}
			}
		}
		System.out.println("-1 -1");
		sc.close();
	}

}
