import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}else {
				map.put(a, 1);
			}
		}
		long first = -1, second = -1;
		for(Map.Entry<Integer, Integer> elem : map.entrySet()) {
			if(elem.getValue() >= 4) {
				if(first == -1) {
					first = elem.getKey(); second = elem.getKey();
					break;
				}else if(second == -1){
					second = elem.getKey();
					break;
				}
			}else if(elem.getValue() >= 2) {
				if(first == -1) {
					first = elem.getKey();
				}else if(second == -1) {
					second = elem.getKey();
					break;
				}
			}
		}
		if(second == -1) System.out.println("0");
		else System.out.println(first * second);
	}
}