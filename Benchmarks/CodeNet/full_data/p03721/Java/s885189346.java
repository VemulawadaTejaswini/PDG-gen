import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c,d;


		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i = 0; i < a; i++) {
			c = sc.nextInt();
			d = sc.nextInt();
			if(map.get(c) != null) {
				map.put(c, map.get(c) + d);
			} else {
				map.put(c, d);
			}
		}

		TreeMap<Integer, Integer> treeMap = new TreeMap(map);//[10]

		for (int key : treeMap.keySet()) {//[8]
            if(map.get(key) >= b) {
            	System.out.println(key);
            	break;
            } else {
            	b -= map.get(key);
            }
        }

	}

}
