
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<String, Integer[]> map = new TreeMap<>();
		
		int max = 0;
		
		for (int i=0;i<n;i++) {
			String s = sc.next();
			if(!map.containsKey(s)) {
				map.put(s, new Integer[1]);
				map.get(s)[0]=0;
			}
			map.get(s)[0]++;
			max = Math.max(max, map.get(s)[0]);
		}
		
		for (Map.Entry<String, Integer[]>e : map.entrySet()) {
			if (e.getValue()[0]==max) {
				System.out.println(e.getKey());
			}
		}
	}

}