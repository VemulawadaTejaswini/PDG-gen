import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long re =0;
		Map<String,Integer>  map = new HashMap<String,Integer> ();
		int N = sc.nextInt();
		for (int i=0;i<N;i++) {
			String s = sc.next();
			char[] c = s.toCharArray();
			Arrays.parallelSort(c);
			String temp = String.valueOf(c);
			if (map.containsKey(temp)==false) {
				map.put(temp, 1);
			} else {
				Integer in = map.get(temp);
				map.put(temp, in+1);
			}
		}
		Set<String> set = map.keySet();
		for (String s: set) {
			Integer in = map.get(s);
			if (in>1) {
				re +=Math.pow(2, in-1)-1;
			}
		}
		System.out.println(re);
	}
}