import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		HashMap<Integer, Long> count = new HashMap<Integer, Long>();
		ArrayList<Integer> keys = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			long b = in.nextInt();
			
			if (keys.indexOf(a) >= 0) {
				b += count.get(a);
			} else {
				keys.add(a);
			}
			count.put(a, b);
		}
		
		
		keys.sort(null);
		
		int index = 0;
		long counter = 0;
		
		while (true && index < keys.size()) {
			counter += count.get(keys.get(index));
			if (counter < k) {
				index++;
			} else {
				break;
			}
		}
		
		if (index == keys.size()) {
			index--;
		}
		
		System.out.println(keys.get(index));
	}
}