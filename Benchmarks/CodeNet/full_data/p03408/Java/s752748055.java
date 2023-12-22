import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String,Integer> blueMap = new HashMap<String,Integer>();
		Map<String,Integer> redMap = new HashMap<String,Integer>();
		for (int i=0;i<N;i++) {
			String s = sc.next();
			if (blueMap.containsKey(s)==false) {
				blueMap.put(s, 1);
				redMap.put(s, 0);
			} else {
				Integer in = blueMap.get(s);
				in ++;
				blueMap.put(s, in);
			}
		}
		int M = sc.nextInt();
		for (int i=0;i<M;i++) {
			String s = sc.next();
			if (redMap.containsKey(s)==false) {
				redMap.put(s, 1);
			} else {
				Integer in = redMap.get(s);
				in ++;
				redMap.put(s, in);
			}
		}
		int max =0;
		Set<String>  set = blueMap.keySet();
		for (String s : set) {
			Integer blue =blueMap.get(s);
			Integer red =redMap.get(s);
			if (blue-red>max) {
				max = blue-red;
			}
		}
		System.out.println(max);
	}
}